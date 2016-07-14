// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConversions._

@SerialVersionUID(0L)
final case class MessageOptions(
    messageSetWireFormat: scala.Option[Boolean] = None,
    noStandardDescriptorAccessor: scala.Option[Boolean] = None,
    deprecated: scala.Option[Boolean] = None,
    mapEntry: scala.Option[Boolean] = None,
    uninterpretedOption: scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MessageOptions] with com.trueaccord.lenses.Updatable[MessageOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (messageSetWireFormat.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, messageSetWireFormat.get) }
      if (noStandardDescriptorAccessor.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, noStandardDescriptorAccessor.get) }
      if (deprecated.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, deprecated.get) }
      if (mapEntry.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, mapEntry.get) }
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
      messageSetWireFormat.foreach { __v => 
        _output__.writeBool(1, __v)
      };
      noStandardDescriptorAccessor.foreach { __v => 
        _output__.writeBool(2, __v)
      };
      deprecated.foreach { __v => 
        _output__.writeBool(3, __v)
      };
      mapEntry.foreach { __v => 
        _output__.writeBool(7, __v)
      };
      uninterpretedOption.foreach { __v => 
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MessageOptions = {
      var __messageSetWireFormat = this.messageSetWireFormat
      var __noStandardDescriptorAccessor = this.noStandardDescriptorAccessor
      var __deprecated = this.deprecated
      var __mapEntry = this.mapEntry
      val __uninterpretedOption = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __messageSetWireFormat = Some(_input__.readBool())
          case 16 =>
            __noStandardDescriptorAccessor = Some(_input__.readBool())
          case 24 =>
            __deprecated = Some(_input__.readBool())
          case 56 =>
            __mapEntry = Some(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.MessageOptions(
          messageSetWireFormat = __messageSetWireFormat,
          noStandardDescriptorAccessor = __noStandardDescriptorAccessor,
          deprecated = __deprecated,
          mapEntry = __mapEntry,
          uninterpretedOption = __uninterpretedOption.result()
      )
    }
    def getMessageSetWireFormat: Boolean = messageSetWireFormat.getOrElse(false)
    def clearMessageSetWireFormat: MessageOptions = copy(messageSetWireFormat = None)
    def withMessageSetWireFormat(__v: Boolean): MessageOptions = copy(messageSetWireFormat = Some(__v))
    def getNoStandardDescriptorAccessor: Boolean = noStandardDescriptorAccessor.getOrElse(false)
    def clearNoStandardDescriptorAccessor: MessageOptions = copy(noStandardDescriptorAccessor = None)
    def withNoStandardDescriptorAccessor(__v: Boolean): MessageOptions = copy(noStandardDescriptorAccessor = Some(__v))
    def getDeprecated: Boolean = deprecated.getOrElse(false)
    def clearDeprecated: MessageOptions = copy(deprecated = None)
    def withDeprecated(__v: Boolean): MessageOptions = copy(deprecated = Some(__v))
    def getMapEntry: Boolean = mapEntry.getOrElse(false)
    def clearMapEntry: MessageOptions = copy(mapEntry = None)
    def withMapEntry(__v: Boolean): MessageOptions = copy(mapEntry = Some(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = scala.collection.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): MessageOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: TraversableOnce[com.google.protobuf.descriptor.UninterpretedOption]): MessageOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]): MessageOptions = copy(uninterpretedOption = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => messageSetWireFormat.getOrElse(null)
        case 2 => noStandardDescriptorAccessor.getOrElse(null)
        case 3 => deprecated.getOrElse(null)
        case 7 => mapEntry.getOrElse(null)
        case 999 => uninterpretedOption
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MessageOptions
}

object MessageOptions extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MessageOptions] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MessageOptions, com.google.protobuf.DescriptorProtos.MessageOptions] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MessageOptions] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MessageOptions, com.google.protobuf.DescriptorProtos.MessageOptions] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.MessageOptions): com.google.protobuf.DescriptorProtos.MessageOptions = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder
    scalaPbSource.messageSetWireFormat.foreach(javaPbOut.setMessageSetWireFormat)
    scalaPbSource.noStandardDescriptorAccessor.foreach(javaPbOut.setNoStandardDescriptorAccessor)
    scalaPbSource.deprecated.foreach(javaPbOut.setDeprecated)
    scalaPbSource.mapEntry.foreach(javaPbOut.setMapEntry)
    javaPbOut.addAllUninterpretedOption(scalaPbSource.uninterpretedOption.map(com.google.protobuf.descriptor.UninterpretedOption.toJavaProto(_)))
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.MessageOptions): com.google.protobuf.descriptor.MessageOptions = com.google.protobuf.descriptor.MessageOptions(
    messageSetWireFormat = if (javaPbSource.hasMessageSetWireFormat) Some(javaPbSource.getMessageSetWireFormat.booleanValue) else None,
    noStandardDescriptorAccessor = if (javaPbSource.hasNoStandardDescriptorAccessor) Some(javaPbSource.getNoStandardDescriptorAccessor.booleanValue) else None,
    deprecated = if (javaPbSource.hasDeprecated) Some(javaPbSource.getDeprecated.booleanValue) else None,
    mapEntry = if (javaPbSource.hasMapEntry) Some(javaPbSource.getMapEntry.booleanValue) else None,
    uninterpretedOption = javaPbSource.getUninterpretedOptionList.map(com.google.protobuf.descriptor.UninterpretedOption.fromJavaProto(_))
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.MessageOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.MessageOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(10)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.MessageOptions(
  )
  implicit class MessageOptionsLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MessageOptions]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MessageOptions](_l) {
    def messageSetWireFormat: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getMessageSetWireFormat)((c_, f_) => c_.copy(messageSetWireFormat = Some(f_)))
    def optionalMessageSetWireFormat: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.messageSetWireFormat)((c_, f_) => c_.copy(messageSetWireFormat = f_))
    def noStandardDescriptorAccessor: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getNoStandardDescriptorAccessor)((c_, f_) => c_.copy(noStandardDescriptorAccessor = Some(f_)))
    def optionalNoStandardDescriptorAccessor: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.noStandardDescriptorAccessor)((c_, f_) => c_.copy(noStandardDescriptorAccessor = f_))
    def deprecated: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Some(f_)))
    def optionalDeprecated: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def mapEntry: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getMapEntry)((c_, f_) => c_.copy(mapEntry = Some(f_)))
    def optionalMapEntry: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.mapEntry)((c_, f_) => c_.copy(mapEntry = f_))
    def uninterpretedOption: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1
  final val NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2
  final val DEPRECATED_FIELD_NUMBER = 3
  final val MAP_ENTRY_FIELD_NUMBER = 7
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
}
