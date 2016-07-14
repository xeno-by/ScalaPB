// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



@SerialVersionUID(0L)
final case class GeneratedCodeInfo(
    annotation: scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[GeneratedCodeInfo] with com.trueaccord.lenses.Updatable[GeneratedCodeInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      annotation.foreach(annotation => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(annotation.serializedSize) + annotation.serializedSize)
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
      annotation.foreach { __v => 
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo = {
      val __annotation = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] ++= this.annotation)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __annotation += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.GeneratedCodeInfo(
          annotation = __annotation.result()
      )
    }
    def clearAnnotation = copy(annotation = scala.collection.Seq.empty)
    def addAnnotation(__vs: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation*): GeneratedCodeInfo = addAllAnnotation(__vs)
    def addAllAnnotation(__vs: TraversableOnce[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = annotation ++ __vs)
    def withAnnotation(__v: scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => annotation
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.GeneratedCodeInfo
}

object GeneratedCodeInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.GeneratedCodeInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.GeneratedCodeInfo(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(18)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 1 => __out = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo(
  )
  @SerialVersionUID(0L)
  final case class Annotation(
      path: scala.collection.Seq[Int] = Nil,
      sourceFile: scala.Option[String] = None,
      begin: scala.Option[Int] = None,
      end: scala.Option[Int] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Annotation] with com.trueaccord.lenses.Updatable[Annotation] {
      private[this] def pathSerializedSize = {
      if (__pathSerializedSizeField == 0) __pathSerializedSizeField = 
        path.map(com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag).sum
      __pathSerializedSizeField
      }
      @transient private[this] var __pathSerializedSizeField: Int = 0
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if(path.nonEmpty) {
          val __localsize = pathSerializedSize
          __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (sourceFile.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, sourceFile.get) }
        if (begin.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, begin.get) }
        if (end.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, end.get) }
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
        if (path.nonEmpty) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(pathSerializedSize)
          path.foreach(_output__.writeInt32NoTag)
        };
        sourceFile.foreach { __v => 
          _output__.writeString(2, __v)
        };
        begin.foreach { __v => 
          _output__.writeInt32(3, __v)
        };
        end.foreach { __v => 
          _output__.writeInt32(4, __v)
        };
      }
      def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = {
        val __path = (scala.collection.immutable.Vector.newBuilder[Int] ++= this.path)
        var __sourceFile = this.sourceFile
        var __begin = this.begin
        var __end = this.end
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __path += _input__.readInt32()
            case 10 => {
              val length = _input__.readRawVarint32()
              val oldLimit = _input__.pushLimit(length)
              while (_input__.getBytesUntilLimit > 0) {
                __path += _input__.readInt32
              }
              _input__.popLimit(oldLimit)
            }
            case 18 =>
              __sourceFile = Some(_input__.readString())
            case 24 =>
              __begin = Some(_input__.readInt32())
            case 32 =>
              __end = Some(_input__.readInt32())
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
            path = __path.result(),
            sourceFile = __sourceFile,
            begin = __begin,
            end = __end
        )
      }
      def clearPath = copy(path = scala.collection.Seq.empty)
      def addPath(__vs: Int*): Annotation = addAllPath(__vs)
      def addAllPath(__vs: TraversableOnce[Int]): Annotation = copy(path = path ++ __vs)
      def withPath(__v: scala.collection.Seq[Int]): Annotation = copy(path = __v)
      def getSourceFile: String = sourceFile.getOrElse("")
      def clearSourceFile: Annotation = copy(sourceFile = None)
      def withSourceFile(__v: String): Annotation = copy(sourceFile = Some(__v))
      def getBegin: Int = begin.getOrElse(0)
      def clearBegin: Annotation = copy(begin = None)
      def withBegin(__v: Int): Annotation = copy(begin = Some(__v))
      def getEnd: Int = end.getOrElse(0)
      def clearEnd: Annotation = copy(end = None)
      def withEnd(__v: Int): Annotation = copy(end = Some(__v))
      def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
        __field.getNumber match {
          case 1 => path
          case 2 => sourceFile.getOrElse(null)
          case 3 => begin.getOrElse(null)
          case 4 => end.getOrElse(null)
        }
      }
      override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
  }
  
  object Annotation extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = {
      require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
      val __fields = descriptor.getFields
      com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
        __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[scala.collection.Seq[Int]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
        __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[Int]],
        __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[Int]]
      )
    }
    def descriptor: com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.descriptor.getNestedTypes.get(0)
    def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
    def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
    lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
    )
    implicit class AnnotationLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation](_l) {
      def path: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[Int]] = field(_.path)((c_, f_) => c_.copy(path = f_))
      def sourceFile: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getSourceFile)((c_, f_) => c_.copy(sourceFile = Some(f_)))
      def optionalSourceFile: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.sourceFile)((c_, f_) => c_.copy(sourceFile = f_))
      def begin: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getBegin)((c_, f_) => c_.copy(begin = Some(f_)))
      def optionalBegin: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.begin)((c_, f_) => c_.copy(begin = f_))
      def end: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getEnd)((c_, f_) => c_.copy(end = Some(f_)))
      def optionalEnd: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
    }
    final val PATH_FIELD_NUMBER = 1
    final val SOURCE_FILE_FIELD_NUMBER = 2
    final val BEGIN_FIELD_NUMBER = 3
    final val END_FIELD_NUMBER = 4
  }
  
  implicit class GeneratedCodeInfoLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo](_l) {
    def annotation: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]] = field(_.annotation)((c_, f_) => c_.copy(annotation = f_))
  }
  final val ANNOTATION_FIELD_NUMBER = 1
}
