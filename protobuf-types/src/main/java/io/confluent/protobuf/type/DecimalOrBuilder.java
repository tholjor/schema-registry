// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: decimal.proto

package io.confluent.protobuf.type;

public interface DecimalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:confluent.type.Decimal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The two's-complement representation of the unscaled integer value in big-endian byte order
   * </pre>
   *
   * <code>bytes value = 1;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <pre>
   * The scale
   * </pre>
   *
   * <code>int32 scale = 2;</code>
   * @return The scale.
   */
  int getScale();
}
