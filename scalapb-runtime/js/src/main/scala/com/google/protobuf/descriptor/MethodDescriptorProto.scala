// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



@SerialVersionUID(0L)
final case class MethodDescriptorProto(
    name: scala.Option[String] = None,
    inputType: scala.Option[String] = None,
    outputType: scala.Option[String] = None,
    options: scala.Option[com.google.protobuf.descriptor.MethodOptions] = None,
    clientStreaming: scala.Option[Boolean] = None,
    serverStreaming: scala.Option[Boolean] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MethodDescriptorProto] with com.trueaccord.lenses.Updatable[MethodDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      if (inputType.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, inputType.get) }
      if (outputType.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(3, outputType.get) }
      if (options.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      if (clientStreaming.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, clientStreaming.get) }
      if (serverStreaming.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, serverStreaming.get) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      name.foreach { __v => 
        _output__.writeString(1, __v)
      };
      inputType.foreach { __v => 
        _output__.writeString(2, __v)
      };
      outputType.foreach { __v => 
        _output__.writeString(3, __v)
      };
      options.foreach { __v => 
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      clientStreaming.foreach { __v => 
        _output__.writeBool(5, __v)
      };
      serverStreaming.foreach { __v => 
        _output__.writeBool(6, __v)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodDescriptorProto = {
      var __name = this.name
      var __inputType = this.inputType
      var __outputType = this.outputType
      var __options = this.options
      var __clientStreaming = this.clientStreaming
      var __serverStreaming = this.serverStreaming
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __inputType = Some(_input__.readString())
          case 26 =>
            __outputType = Some(_input__.readString())
          case 34 =>
            __options = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)))
          case 40 =>
            __clientStreaming = Some(_input__.readBool())
          case 48 =>
            __serverStreaming = Some(_input__.readBool())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.MethodDescriptorProto(
          name = __name,
          inputType = __inputType,
          outputType = __outputType,
          options = __options,
          clientStreaming = __clientStreaming,
          serverStreaming = __serverStreaming
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: MethodDescriptorProto = copy(name = None)
    def withName(__v: String): MethodDescriptorProto = copy(name = Some(__v))
    def getInputType: String = inputType.getOrElse("")
    def clearInputType: MethodDescriptorProto = copy(inputType = None)
    def withInputType(__v: String): MethodDescriptorProto = copy(inputType = Some(__v))
    def getOutputType: String = outputType.getOrElse("")
    def clearOutputType: MethodDescriptorProto = copy(outputType = None)
    def withOutputType(__v: String): MethodDescriptorProto = copy(outputType = Some(__v))
    def getOptions: com.google.protobuf.descriptor.MethodOptions = options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)
    def clearOptions: MethodDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.MethodOptions): MethodDescriptorProto = copy(options = Some(__v))
    def getClientStreaming: Boolean = clientStreaming.getOrElse(false)
    def clearClientStreaming: MethodDescriptorProto = copy(clientStreaming = None)
    def withClientStreaming(__v: Boolean): MethodDescriptorProto = copy(clientStreaming = Some(__v))
    def getServerStreaming: Boolean = serverStreaming.getOrElse(false)
    def clearServerStreaming: MethodDescriptorProto = copy(serverStreaming = None)
    def withServerStreaming(__v: Boolean): MethodDescriptorProto = copy(serverStreaming = Some(__v))
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => name.getOrElse(null)
        case 2 => inputType.getOrElse(null)
        case 3 => outputType.getOrElse(null)
        case 4 => options.getOrElse(null)
        case 5 => clientStreaming.getOrElse(null)
        case 6 => serverStreaming.getOrElse(null)
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MethodDescriptorProto
}

object MethodDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.MethodDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.MethodDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.MethodOptions]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[Boolean]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(8)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 4 => __out = com.google.protobuf.descriptor.MethodOptions
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.MethodDescriptorProto(
  )
  implicit class MethodDescriptorProtoLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def inputType: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getInputType)((c_, f_) => c_.copy(inputType = Some(f_)))
    def optionalInputType: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.inputType)((c_, f_) => c_.copy(inputType = f_))
    def outputType: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getOutputType)((c_, f_) => c_.copy(outputType = Some(f_)))
    def optionalOutputType: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.outputType)((c_, f_) => c_.copy(outputType = f_))
    def options: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.MethodOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def clientStreaming: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getClientStreaming)((c_, f_) => c_.copy(clientStreaming = Some(f_)))
    def optionalClientStreaming: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.clientStreaming)((c_, f_) => c_.copy(clientStreaming = f_))
    def serverStreaming: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getServerStreaming)((c_, f_) => c_.copy(serverStreaming = Some(f_)))
    def optionalServerStreaming: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.serverStreaming)((c_, f_) => c_.copy(serverStreaming = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val INPUT_TYPE_FIELD_NUMBER = 2
  final val OUTPUT_TYPE_FIELD_NUMBER = 3
  final val OPTIONS_FIELD_NUMBER = 4
  final val CLIENT_STREAMING_FIELD_NUMBER = 5
  final val SERVER_STREAMING_FIELD_NUMBER = 6
}
