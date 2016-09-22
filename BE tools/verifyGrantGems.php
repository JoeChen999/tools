<?php
$admin_level_req = 3;

require('admincommon.php');

if ($adminLevel < $admin_level_req) {
    echo 'You have no right to access this mode';
    exit;
}
$ip=$_SERVER['REMOTE_ADDR'];
if (!Model_Verify_IPAccess::checkIP($ip)){
    echo 'Your IP is<p style="color:green">'.$ip.'</p> it is not allowed to access this mode,please contact administrator';
    exit;
}
global $arAdminCookieInfo;
$cur_cookie_admin_id = isset($arAdminCookieInfo['id']) ? $arAdminCookieInfo['id'] : 0;
if (!Model_Verify_Gems::checkPermission($cur_cookie_admin_id,'canVerifyGems')){
    echo "You have no right to access this mode";
    exit;
}
$page = isset($_GET['page']) ? intval($_GET['page']) : 1;

$result = Model_Verify_Gems::listAll($page, Model_Verify_Gems::LIST_PAGESIZE);
$param = '';
$strPage = adminPage($result['totalPage'], $result['page'], $param, Model_Verify_Gems::LIST_PAGESIZE);

$opPass = Model_Verify_Gems::VERIFY_STATUS_PASSED;
$opRefuse = Model_Verify_Gems::VERIFY_STATUS_REFUSED;
$opDelete = Model_Verify_Gems::VERIFY_STATUS_DELETE;
?>

<html>
    <body>
        <table>
            <tr><td width="190" valign="top">
                    <?php
                    printAdminContents();
                    ?>
                </td>
                <td style="vertical-align:top;"> <!-- Start Right Column -->
                    <p style="font-size:18px;color:orange;font-weight:bold;">Kabam <span style="margin-left:10px;font-weight:normal;color:#000;"><?php echo ADMIN_GAME_NAME; ?>  - Gems</span></p>
                    <div name="outershell">
                        <?php echo $strPage; ?>
                        <br />
                        <div>Batch Processing:  &nbsp;&nbsp;&nbsp;
                            <a href="javascript:verifyMulti(<?php echo $opPass; ?>)">Batch Pass</a>&nbsp;&nbsp;&nbsp;
                            <a href="javascript:verifyMulti(<?php echo $opRefuse; ?>)">Batch Refuse</a>&nbsp;&nbsp;&nbsp;
                            <a href="javascript:verifyMulti(<?php echo $opDelete; ?>)">Batch Delete</a>
                        </div>
                        <br />
                        <table border="1"><tbody><tr>
                                    <th><input id="checkAll" type="checkbox"/> Select All</th><th>logid</th><th>requester</th><th>requesterIP</th><th>playerId</th><th>gemsCnt</th><th>verifyStatus</th><th>verifyAccount</th>
                                    <th>createdTime</th><th>updatedTime</th><th>manage</th>
                                </tr>

                                <?php
                                foreach ($result['data'] as $item) {
                                    switch ($item['verifyStatus']) {
                                        case Model_Verify_Gems::VERIFY_STATUS_DEFAULT:
                                            $verifyStatus = 'waiting...';
                                            $manage = <<<EOF
<a href='javascript:verifySingle({$item['id']}, {$opPass});'><font color='blue'>pass</font></a>&nbsp;&nbsp;&nbsp
<a href='javascript:verifySingle({$item['id']}, {$opRefuse});'><font color='red'>refuse</font></a>&nbsp;&nbsp;&nbsp
<a href='javascript:verifySingle({$item['id']}, {$opDelete});'><font color='black'>delete</font></a>
EOF;
                                            break;
                                        case Model_Verify_Gems::VERIFY_STATUS_PASSED:
                                            $verifyStatus = "<font color='blue'>passed</font>";
                                            $manage = "N/A";
                                            break;
                                        case Model_Verify_Gems::VERIFY_STATUS_REFUSED:
                                            $verifyStatus = "<font color='red'>refused</font>";
                                            $manage = <<<EOF
<a href='javascript:verifySingle({$item['id']}, {$opPass});'><font color='blue'>pass</font></a>&nbsp;&nbsp;&nbsp
<a href='javascript:verifySingle({$item['id']}, {$opDelete});'><font color='black'>delete</font></a>
EOF;
                                            break;
                                        default:
                                            break;
                                    }
                                    echo <<<EOF
<tr>
<td><input name='cBox[]' value={$item['id']} type='checkbox'/></td>
<td>{$item['id']}</td>
<td>{$item['requester']}</td>
<td>{$item['requesterIP']}</td>
<td>{$item['playerId']}</td>
<td>{$item['gemsCnt']}</td>
<td id='{$item['id']}' pid='{$item['playerId']}' gems='{$item['gemsCnt']}'>$verifyStatus</td>
<td>{$item['verifyAccount']}</td>
<td>{$item['createdTime']}</td>
<td>{$item['updatedTime']}</td>
<td>{$manage}</td>
</tr>    
EOF;
                                }
                                ?>

                            </tbody></table>

                        <br>

                        <div>Batch Processing:  &nbsp;&nbsp;&nbsp;
                            <a href="javascript:return verifyMulti(<?php echo $opPass; ?>);">Batch Pass</a>&nbsp;&nbsp;&nbsp;
                            <a href="javascript:return verifyMulti(<?php echo $opRefuse; ?>);">Batch Refuse</a>&nbsp;&nbsp;&nbsp;
                            <a href="javascript:return verifyMulti(<?php echo $opDelete; ?>);">Batch Delete</a>
                        </div>
                        <br />

                        <?php echo $strPage; ?>

                    </div>                   
                </td><!-- End Right Column -->
            </tr>
        </table>
    </body>
    <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script src="http://code.jquery.com/ui/1.8.21/jquery-ui.min.js"></script>
    <script type="text/javascript">
        String.prototype.trim = function() {
            return this.replace(/<!-[^<>]*->/ig, '');
        };
        
        function verifySingle(id, op) {
            var pId = $("#" + id).attr("pid");
            var gems = $("#" + id).attr("gems");
            var operation = 1 == op ? 'PASS' : 2 == op ? 'REFUSE' : 'DELETE';
            if (confirm("Grant " + gems + " gems to player " + pId + ", " + operation + " ?")) {
                $.post(
                    "ajaxurl/verifyGemsAjax.php",
                    {id: id, op: op},
                    function(data) {
                        alert(data.msg);
                        if (data.ok) {
                            location.reload(true);
                        }
                    },
                    "json"
                );
            }
        }
        
        function verifyMulti(op) {
            var operation = 1 == op ? 'PASS' : 2 == op ? 'REFUSE' : 'DELETE';
            var recordIds = document.getElementsByName("cBox[]");
            var cnt = 0;
            var ids = '';
            var confirmMsg = '';
            for (var i = 0; i < recordIds.length; i++) {
                if(recordIds[i].checked == true) {
                    cnt++;
                    var id = recordIds[i].value;
                    ids += id + ',';
                    var pId = $("#" + id).attr("pid");
                    var gems = $("#" + id).attr("gems");
                    confirmMsg += "Grant " + gems + " gems to player " + pId + ", " + operation + " ? \n";
                }
            }
            if(cnt<1) {
                alert('Please select at least one record');
                location.reload(true);
            } else {
                if(confirm(confirmMsg)) {
                    $.post(
                    "ajaxurl/verifyGemsAjax.php",
                    {id: ids, op: op},
                    function(data) {
                        alert(data.msg);
                        if (data.ok) {
                            location.reload(true);
                        }
                    },
                    "json"
                );
                }
            }
        }

        $("#checkAll").click(function() {
            var selectAll = document.getElementById("checkAll");
            var recordIds = document.getElementsByName("cBox[]");
            if (selectAll.checked == true) {
                for (var i = 0; i < recordIds.length; i++) {
                    recordIds[i].checked = true;
                }
            } else {
                for (var i = 0; i < recordIds.length; i++) {
                   recordIds[i].checked = false;
               }
           }
        });
        
        $("input[name='cBox[]']").click(function () {
            if($(this).attr("checked") != "checked") {
                var selectAll = document.getElementById("checkAll");
                selectAll.checked = false;
            }
        });
    </script>
</html>

