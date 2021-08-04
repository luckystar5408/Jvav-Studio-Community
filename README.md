# Jvav Studio powered by Intellij Platform

这些说明将帮助您从源代码构建Jvav Studio
以下约定将用于引用计算机上的目录：
*`<USER_HOME>`是您的主目录。*
*`<IDEA_HOME>`是IntelliJ源代码的根目录。*

## 获取Jvav Studio源代码
可以从[Github](https://github.com/haarlemmer/Jvav-Studio-Community)获取Jvav Studio源代码，方法是克隆或
将一个zip文件（基于分支）下载到`<IDEA_HOME>`中。默认为* master *分支。

master分支包含源代码，这些源代码将用于创建IntelliJ IDEA的下一个主要版本。分支名称
以及IntelliJ IDEA的较早版本的内部版本号可以在以下页面找到：
[内部版本号范围]（https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html）。

_**速度提示：**_ 如果不需要完整的存储库历史记录，则使用浅表克隆（`git clone --depth 1`）将节省大量时间。

这些Git操作也可以通过[IntelliJ IDEA用户界面](https://www.jetbrains.com/help/idea/using-git-integration.html)完成。

IntelliJ IDEA社区版需要来自单独的Git存储库的其他Android模块。要克隆这些存储库，
运行位于<IDEA_HOME>目录中的getPlugins脚本之一。这些脚本克隆它们各自的 *master* 分支。
* Linux或macOS: `getPlugins.sh`
* Windows: `getPlugins.bat`

_**注意：**_ 始终将git init和initellij-community和android Git存储库都复制到相同的分支/标签。

## 构建 Jvav Studio
要构建和开发，需要版本 2020.1 或更高版本的 IntelliJ IDEA Community Edition 或 IntelliJ IDEA Ultimate Edition。
用于IntelliJ平台。

### 打开IntelliJ源代码进行构建
使用IntelliJ IDEA **文件|打开**，选择“ <IDEA_HOME>”目录。
*如果IntelliJ IDEA显示有关缺少或过期的所需插件（例如Kotlin）的错误，
  [启用，升级或安装该插件](https://www.jetbrains.com/help/idea/managing-plugins.html)并重新启动IntelliJ IDEA。*
*如果IntelliJ IDEA显示有关未找到Gradle配置的错误，
  [刷新Gradle项目](https://www.jetbrains.com/help/idea/jetgradle-tool-window.html)。*

### IntelliJ构建配置
1. 配置一个名为“ **corretto-11** ”的 JDK ，指向 JDK 11 的安装。建议使用 Amazon Corretto JDK ，而其他
   基于OpenJDK的发行版也应该工作。您可以 [直接下载](https://www.jetbrains.com/help/idea/sdk.html#jdk-from-ide) 
   从项目结构对话框。
   
2. 如果禁用了_Maven Integration_插件，请 [添加路径变量](https://www.jetbrains.com/help/idea/absolute-path-variables.html) 
   指向“ <USER_HOME>/.m2 /repository ”目录的“ **MAVEN_REPOSITORY** ”。
   
3. _**速度提示：**_ 如果您的计算机上有足够的RAM，
   [配置编译器设置](https://www.jetbrains.com/help/idea/specification-compilation-settings.html)
   启用“并行编译独立模块”选项。另外，增加构建过程堆大小：
   *如果您使用IntelliJ IDEA 2020.3或更高版本，请将“用户本地生成过程堆大小”设置为2048。*
   *如果您使用的是IntelliJ IDEA 2020.2或更旧的版本，请将值从“共享的构建过程VM选项”复制到“用户本地构建过程VM选项”，然后在其中添加-Xmx2G。*
    
    这些更改将大大减少编译时间。

### 构建IntelliJ应用程序源代码
要从源代码构建IntelliJ IDEA社区版，请选择** Build |从主菜单构建项目**。

要构建安装软件包，请在<IDEA_HOME>目录中运行`ant`命令。有关详细信息，请参见`build.xml`文件。

## 运行IntelliJ IDEA
要运行从源代码构建的IntelliJ IDEA，请选择**运行|从主菜单运行**。这将使用预配置的运行配置“ **IDEA**”。

要在构建上运行测试，请将这些设置应用于**Run |编辑配置... |模板| JUnit**配置选项卡：
  *工作目录：`<IDEA_HOME> / bin`
  * VM选项：
    *`-ea`
    *`-Didea.config.path = .. / test-config`
    *`-Didea.system.path = .. / test-system`
 
您可以在[https://www.jetbrains.com/opensource/idea](https://www.jetbrains.com/opensource/idea)上找到其他有用的信息。
该站点的“贡献代码”部分描述了如何为IntelliJ IDEA做出贡献。
