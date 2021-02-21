// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package maven.dsl.groovy

class build {

  //-- build base
  /**
   * The default goal (or phase in Maven 2) to execute when none is specified for the project.
   * Note that in case of a multi-module build, only the default goal of the top-level project is relevant,
   * i.e. the default goals of child modules are ignored.
   * Since Maven 3, multiple goals/phases can be separated by whitespace.
   */
  String defaultGoal;

  /**
   * The directory where all files generated by the
   * build are placed.
   * The default value is <code>target</code>.
   */
  String directory;

  /**
   * The filename (excluding the extension, and with
   * no path information) that the produced artifact will be called.
   * The default value is <code>${artifactId}-${version}</code>.
   */
  String finalName;
  //-- build base

  /**
   * This element specifies a directory containing the source of the project.
   * The generated build system will compile the sources from this directory when the project is built.
   * The path given is relative to the project descriptor.
   * The default value is <code>src/main/java</code>.
   */
  String sourceDirectory;

  /**
   * This element specifies a directory containing the script sources of the project. This directory is meant to be different
   * from the sourceDirectory, in that its contents will be copied to the output directory in most cases (since scripts are
   * interpreted rather than compiled).
   * The default value is <code>src/main/scripts</code>.
   *
   */
  String scriptSourceDirectory;

  /**
   * This element specifies a directory containing the unit test source of the project.
   * The generated build system will compile these directories when the project is being tested.
   * The path given is relative to the project descriptor.
   * The default value is <code>src/test/java</code>.
   */
  String testSourceDirectory;

  /**
   * The directory where compiled application classes are placed.
   * The default value is <code>target/classes</code>.
   */
  String outputDirectory;

  /**
   * The directory where compiled test classes are placed.
   * The default value is <code>target/test-classes</code>.
   */
  String testOutputDirectory;

  //-- build base
  /**
   * Set the list of filter properties files that are used when
   * filtering is enabled.
   */
  void filters(List<String> filters) {}
  /**
   * Set the list of filter properties files that are used when
   * filtering is enabled.
   */
  void filters(String... filters) {}

  def resources
  /**
   * Set this element describes all of the classpath resources
   * such as properties files associated with a project. These resources
   * are often included in the final package.
   * The default value is <code>src/main/resources</code>.
   */
  void resources(Closure closure) {}
  /**
   * Set the default goal (or phase in Maven 2) to execute when
   * none is specified for the project. Note that in case of a multi-module
   * build, only the default goal of the top-level project is relevant, i.e. the default goals of
   * child modules are ignored. Since Maven 3, multiple goals/phases can be separated by whitespace.
   */
  void defaultGoal(String defaultGoal) {}

  /**
   * Set the directory where all files generated by the build are
   * placed. The default value is <code>target</code>.
   */
  void directory(String directory) {}

  /**
   * Set the filename (excluding the extension, and with no path
   * information) that the produced artifact will be called.
   * The default value is <code>${artifactId}-${version}</code>.
   */
  void finalName(String finalName) {}

  def testResources
  /**
   * Set this element describes all of the classpath resources
   * such as properties files associated with a project's unit tests.
   * The default value is <code>src/test/resources</code>.
   */
  void testResources(Closure closure) {}
  //-- build base

  def extensions
  /**
   * Set of build extensions to use from this project.
   */
  void extensions(Closure closure) {}

  /**
   * Set the directory where compiled application classes are
   * placed.
   * The default value is <code>target/classes</code>.
   */
  void outputDirectory(String outputDirectory) {}

  /**
   * Set this element specifies a directory containing the script
   * sources of the project. This directory is meant to be different
   * from the sourceDirectory, in that its contents will be copied to the output directory
   * in most cases (since scripts are interpreted rather than compiled).
   * The default value is <code>src/main/scripts</code>.
   */
  void scriptSourceDirectory(String scriptSourceDirectory) {}

  /**
   * Set this element specifies a directory containing the source of the project.
   * The generated build system will compile the sources from this directory when the project is built.
   * The path given is relative to the project descriptor.
   * The default value is <code>src/main/java</code>.
   */
  void sourceDirectory(String sourceDirectory) {}

  /**
   * Set the directory where compiled test classes are placed.
   * The default value is <code>target/test-classes</code>.
   */
  void testOutputDirectory(String testOutputDirectory) {}

  /**
   * Set this element specifies a directory containing the unit test source of the project.
   * The generated build system will compile these directories when the project is being tested.
   * The path given is relative to the project descriptor.
   * The default value is <code>src/test/java</code>.
   */
  void testSourceDirectory(String testSourceDirectory) {}

  def pluginManagement
  /**
   * Set the list of plugins to use.
   */
  void pluginManagement(Closure closure) {}
}