// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processMediator.proto

package com.intellij.execution.process.mediator.rpc;

public interface CommandLineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:intellij.process.mediator.rpc.CommandLine)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string command = 1;</code>
   * @return A list containing the command.
   */
  java.util.List<java.lang.String>
      getCommandList();
  /**
   * <code>repeated string command = 1;</code>
   * @return The count of command.
   */
  int getCommandCount();
  /**
   * <code>repeated string command = 1;</code>
   * @param index The index of the element to return.
   * @return The command at the given index.
   */
  java.lang.String getCommand(int index);
  /**
   * <code>repeated string command = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the command at the given index.
   */
  com.google.protobuf.ByteString
      getCommandBytes(int index);

  /**
   * <code>string working_dir = 2;</code>
   * @return The workingDir.
   */
  java.lang.String getWorkingDir();
  /**
   * <code>string working_dir = 2;</code>
   * @return The bytes for workingDir.
   */
  com.google.protobuf.ByteString
      getWorkingDirBytes();

  /**
   * <code>string in_file = 3;</code>
   * @return The inFile.
   */
  java.lang.String getInFile();
  /**
   * <code>string in_file = 3;</code>
   * @return The bytes for inFile.
   */
  com.google.protobuf.ByteString
      getInFileBytes();

  /**
   * <code>string out_file = 4;</code>
   * @return The outFile.
   */
  java.lang.String getOutFile();
  /**
   * <code>string out_file = 4;</code>
   * @return The bytes for outFile.
   */
  com.google.protobuf.ByteString
      getOutFileBytes();

  /**
   * <code>string err_file = 5;</code>
   * @return The errFile.
   */
  java.lang.String getErrFile();
  /**
   * <code>string err_file = 5;</code>
   * @return The bytes for errFile.
   */
  com.google.protobuf.ByteString
      getErrFileBytes();

  /**
   * <code>map&lt;string, string&gt; environ = 6;</code>
   */
  int getEnvironCount();
  /**
   * <code>map&lt;string, string&gt; environ = 6;</code>
   */
  boolean containsEnviron(
      java.lang.String key);
  /**
   * Use {@link #getEnvironMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnviron();
  /**
   * <code>map&lt;string, string&gt; environ = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironMap();
  /**
   * <code>map&lt;string, string&gt; environ = 6;</code>
   */

  java.lang.String getEnvironOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; environ = 6;</code>
   */

  java.lang.String getEnvironOrThrow(
      java.lang.String key);
}