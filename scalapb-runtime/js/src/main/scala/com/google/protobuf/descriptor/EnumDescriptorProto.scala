// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



@SerialVersionUID(0L)
final case class EnumDescriptorProto(
    name: scala.Option[String] = None,
    value: scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto] = Nil,
    options: scala.Option[com.google.protobuf.descriptor.EnumOptions] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EnumDescriptorProto] with com.trueaccord.lenses.Updatable[EnumDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      value.foreach(value => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.serializedSize) + value.serializedSize)
      if (options.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
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
      value.foreach { __v => 
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      options.foreach { __v => 
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumDescriptorProto = {
      var __name = this.name
      val __value = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumValueDescriptorProto] ++= this.value)
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __value += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.EnumValueDescriptorProto.defaultInstance)
          case 26 =>
            __options = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.EnumOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.EnumDescriptorProto(
          name = __name,
          value = __value.result(),
          options = __options
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: EnumDescriptorProto = copy(name = None)
    def withName(__v: String): EnumDescriptorProto = copy(name = Some(__v))
    def clearValue = copy(value = scala.collection.Seq.empty)
    def addValue(__vs: com.google.protobuf.descriptor.EnumValueDescriptorProto*): EnumDescriptorProto = addAllValue(__vs)
    def addAllValue(__vs: TraversableOnce[com.google.protobuf.descriptor.EnumValueDescriptorProto]): EnumDescriptorProto = copy(value = value ++ __vs)
    def withValue(__v: scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]): EnumDescriptorProto = copy(value = __v)
    def getOptions: com.google.protobuf.descriptor.EnumOptions = options.getOrElse(com.google.protobuf.descriptor.EnumOptions.defaultInstance)
    def clearOptions: EnumDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.EnumOptions): EnumDescriptorProto = copy(options = Some(__v))
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => name.getOrElse(null)
        case 2 => value
        case 3 => options.getOrElse(null)
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumDescriptorProto
}

object EnumDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumDescriptorProto] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.EnumDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.EnumDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.EnumOptions]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(5)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 2 => __out = com.google.protobuf.descriptor.EnumValueDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.EnumOptions
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumDescriptorProto(
  )
  implicit class EnumDescriptorProtoLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumDescriptorProto](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def value: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.EnumValueDescriptorProto]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    def options: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.EnumOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
}
