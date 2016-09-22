from StringIO import StringIO
import gzip

def unzip(gzipdata):
    inbuffer = StringIO(gzipdata)
    f = gzip.GzipFile(mode="rb", fileobj=inbuffer)
    rdata = f.read()
    return rdata
