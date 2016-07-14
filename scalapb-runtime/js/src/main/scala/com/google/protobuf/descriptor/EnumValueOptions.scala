// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



@SerialVersionUID(0L)
final case class EnumValueOptions(
    deprecated: scala.Option[Boolean] = None,
    uninterpretedOption: scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EnumValueOptions] with com.trueaccord.lenses.Updatable[EnumValueOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (deprecated.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, deprecated.get) }
      uninterpretedOption.foreach(uninterpretedOption => __size += 2 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(uninterpretedOption.serializedSize) + uninterpretedOption.serializedSize)
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
      deprecated.foreach { __v => 
        _output__.writeBool(1, __v)
      };
      uninterpretedOption.foreach { __v => 
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumValueOptions = {
      var __deprecated = this.deprecated
      val __uninterpretedOption = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __deprecated = Some(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.EnumValueOptions(
          deprecated = __deprecated,
          uninterpretedOption = __uninterpretedOption.result()
      )
    }
    def getDeprecated: Boolean = deprecated.getOrElse(false)
    def clearDeprecated: EnumValueOptions = copy(deprecated = None)
    def withDeprecated(__v: Boolean): EnumValueOptions = copy(deprecated = Some(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = scala.collection.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): EnumValueOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: TraversableOnce[com.google.protobuf.descriptor.UninterpretedOption]): EnumValueOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]): EnumValueOptions = copy(uninterpretedOption = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => deprecated.getOrElse(null)
        case 999 => uninterpretedOption
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumValueOptions
}

object EnumValueOptions extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumValueOptions] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumValueOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.EnumValueOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.EnumValueOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(13)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumValueOptions(
  )
  implicit class EnumValueOptionsLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumValueOptions]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumValueOptions](_l) {
    def deprecated: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Some(f_)))
    def optionalDeprecated: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def uninterpretedOption: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val DEPRECATED_FIELD_NUMBER = 1
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
}
