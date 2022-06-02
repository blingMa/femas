// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaasPolling.proto

package com.tencent.tsf.femas.config.grpc.paas;

import com.tencent.tsf.femas.common.util.StringUtils;

/**
 * Protobuf type {@code grpc.SimpleParam}
 */
public final class SimpleParam extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.SimpleParam)
    SimpleParamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleParam.newBuilder() to construct.
  private SimpleParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleParam() {
    param_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimpleParam();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimpleParam(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            param_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_SimpleParam_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_SimpleParam_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tencent.tsf.femas.config.grpc.paas.SimpleParam.class, com.tencent.tsf.femas.config.grpc.paas.SimpleParam.Builder.class);
  }

  public static final int PARAM_FIELD_NUMBER = 1;
  private volatile java.lang.Object param_;
  /**
   * <code>string param = 1;</code>
   * @return The param.
   */
  @java.lang.Override
  public java.lang.String getParam() {
    java.lang.Object ref = param_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      param_ = s;
      return s;
    }
  }
  /**
   * <code>string param = 1;</code>
   * @return The bytes for param.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParamBytes() {
    java.lang.Object ref = param_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      param_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) {
      return true;
    }
    if (isInitialized == 0) {
      return false;
    }

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (StringUtils.isNotBlank((String)param_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, param_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) {
      return size;
    }

    size = 0;
    if (StringUtils.isNotBlank((String)param_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, param_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tencent.tsf.femas.config.grpc.paas.SimpleParam)) {
      return super.equals(obj);
    }
    com.tencent.tsf.femas.config.grpc.paas.SimpleParam other = (com.tencent.tsf.femas.config.grpc.paas.SimpleParam) obj;

    if (!getParam().equals(other.getParam())) {
      return false;
    }
    if (!unknownFields.equals(other.unknownFields)){
      return false;
    }
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARAM_FIELD_NUMBER;
    hash = (53 * hash) + getParam().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tencent.tsf.femas.config.grpc.paas.SimpleParam prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.SimpleParam}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.SimpleParam)
      com.tencent.tsf.femas.config.grpc.paas.SimpleParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_SimpleParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_SimpleParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.tsf.femas.config.grpc.paas.SimpleParam.class, com.tencent.tsf.femas.config.grpc.paas.SimpleParam.Builder.class);
    }

    // Construct using com.tencent.tsf.femas.config.grpc.paas.SimpleParam.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      param_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tencent.tsf.femas.config.grpc.paas.LongPollingServer.internal_static_grpc_SimpleParam_descriptor;
    }

    @java.lang.Override
    public com.tencent.tsf.femas.config.grpc.paas.SimpleParam getDefaultInstanceForType() {
      return com.tencent.tsf.femas.config.grpc.paas.SimpleParam.getDefaultInstance();
    }

    @java.lang.Override
    public com.tencent.tsf.femas.config.grpc.paas.SimpleParam build() {
      com.tencent.tsf.femas.config.grpc.paas.SimpleParam result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tencent.tsf.femas.config.grpc.paas.SimpleParam buildPartial() {
      com.tencent.tsf.femas.config.grpc.paas.SimpleParam result = new com.tencent.tsf.femas.config.grpc.paas.SimpleParam(this);
      result.param_ = param_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tencent.tsf.femas.config.grpc.paas.SimpleParam) {
        return mergeFrom((com.tencent.tsf.femas.config.grpc.paas.SimpleParam)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tencent.tsf.femas.config.grpc.paas.SimpleParam other) {
      if (other == com.tencent.tsf.femas.config.grpc.paas.SimpleParam.getDefaultInstance()){
        return this;
      }
      if (!other.getParam().isEmpty()) {
        param_ = other.param_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tencent.tsf.femas.config.grpc.paas.SimpleParam parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tencent.tsf.femas.config.grpc.paas.SimpleParam) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object param_ = "";
    /**
     * <code>string param = 1;</code>
     * @return The param.
     */
    @Override
    public java.lang.String getParam() {
      java.lang.Object ref = param_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        param_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string param = 1;</code>
     * @return The bytes for param.
     */
    @Override
    public com.google.protobuf.ByteString
        getParamBytes() {
      java.lang.Object ref = param_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        param_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string param = 1;</code>
     * @param value The param to set.
     * @return This builder for chaining.
     */
    public Builder setParam(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      param_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string param = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam() {
      
      param_ = getDefaultInstance().getParam();
      onChanged();
      return this;
    }
    /**
     * <code>string param = 1;</code>
     * @param value The bytes for param to set.
     * @return This builder for chaining.
     */
    public Builder setParamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      param_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.SimpleParam)
  }

  // @@protoc_insertion_point(class_scope:grpc.SimpleParam)
  private static final com.tencent.tsf.femas.config.grpc.paas.SimpleParam DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tencent.tsf.femas.config.grpc.paas.SimpleParam();
  }

  public static com.tencent.tsf.femas.config.grpc.paas.SimpleParam getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleParam>
      PARSER = new com.google.protobuf.AbstractParser<SimpleParam>() {
    @java.lang.Override
    public SimpleParam parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimpleParam(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleParam> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleParam> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tencent.tsf.femas.config.grpc.paas.SimpleParam getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

