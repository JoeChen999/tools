# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: PBMsgReqPlayerInfo.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)




DESCRIPTOR = _descriptor.FileDescriptor(
  name='PBMsgReqPlayerInfo.proto',
  package='',
  serialized_pb='\n\x18PBMsgReqPlayerInfo.proto\"=\n\x12PBMsgReqPlayerInfo\x12\x12\n\npveInfoVer\x18\x01 \x01(\t\x12\x13\n\x0bheroInfoVer\x18\x02 \x01(\t')




_PBMSGREQPLAYERINFO = _descriptor.Descriptor(
  name='PBMsgReqPlayerInfo',
  full_name='PBMsgReqPlayerInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='pveInfoVer', full_name='PBMsgReqPlayerInfo.pveInfoVer', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='heroInfoVer', full_name='PBMsgReqPlayerInfo.heroInfoVer', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=28,
  serialized_end=89,
)

DESCRIPTOR.message_types_by_name['PBMsgReqPlayerInfo'] = _PBMSGREQPLAYERINFO

class PBMsgReqPlayerInfo(_message.Message):
  __metaclass__ = _reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _PBMSGREQPLAYERINFO

  # @@protoc_insertion_point(class_scope:PBMsgReqPlayerInfo)


# @@protoc_insertion_point(module_scope)