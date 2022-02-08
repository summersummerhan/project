/**

*植物生长模拟应用

*

*@作者夏航NUID 001534616

* Northeastern University

*CSYE6200：面向对象设计

*教授：马克·蒙森

*

*-------------------------功能描述-------------------------

*模拟植物生长过程的javaswing应用程序。

*

*在按下开始按钮之前，用户可以更改一些基本设置

*包括生长规律、生长世代、植物颜色、是否

*以显示生长过程和茎的长度和弧度。也包括用户

*可按随机按钮随机设置参数

*

*按下开始按钮后，面板将显示

*植物，当生长过程框

*不是“没有过程”。

*

*当成长过程框为“快”、“中”或“慢”时，则用户

*可按停止按钮暂停绘图过程；当绘图过程

*暂停后，用户可以按恢复按钮重新开始。

*

*在绘制过程中，无法调整窗口大小。之后

*绘制过程完成后，可以调整窗口大小。

*

*在“文件”菜单中，用户可以单击“退出”退出应用程序，

*在“帮助”菜单中，用户可以单击“关于”查看帮助

*文件：自述文件.md.

*

*在绘制过程中，有两个变量可以修改

*实时：生长速度和颜色。

*

*所有信息都将打印在InfoPanel的JTextField中-

*在主面板的右侧。

* -------------------------------------------------------------------

*/



/*------------------------用例-------------------------------*/



用例：<FileMenu:Exit>

编号：1

级别：<中等>

Description<退出应用程序>

参与者<Users>

触发器<单击文件菜单并单击退出>





用例：<HelpMenu:About>

编号：2

级别：<中等>

说明<显示帮助文件：自述文件.md>

参与者<Users>

触发器<Click help menu and Click about>





用例：<ruleBox>

编号：3

级别：<中等>

描述<选择要模拟和绘制的规则（规则1/2/3）。>

参与者<Users>

触发器<Select different rules in JComboBox>





用例：<gentextfield>

编号：4

级别：<中等>

Description<将最大生成量设置为增长（0~9）>

参与者<Users>

触发器<JTextField:genTextField>





用例：<colorBox>

编号：5

级别：<中等>

描述<选择要绘制的颜色>

参与者<Users>

触发器<在JComboBox中选择不同的颜色>





用例：<growthBox>

编号：6

级别：<中等>

Description<选择是否显示生长过程>

参与者<Users>

触发器<Select different rules in JComboBox（true of false）>





用例：<lengthSlider>

编号：7

级别：<中等>

Description<滑动滑块以设置不同的生长长度>

参与者<Users>

触发器<Silde the lengthSlider>





用例：<radianSlider>

编号：8

级别：<中等>

Description<滑动滑块以设置不同的旋转弧度>

参与者<Users>

触发器<Silde the radianSlider>





用例：<midLengthSlider>

编号：9

级别：<中等>

Description<滑动滑块以设置中间茎的不同生长长度。仅在规则2/3中可用；在规则3中有四个增长方向，它影响两个中间方向的增长>

参与者<Users>

触发器<Silde the middlengthslider>





用例：<middradianslider>

编号：10

级别：<中等>

Description<滑动滑块以设置中间杆的不同旋转弧度。仅适用于规则3；在规则3中有四个生长方向，它影响两个中间方向的弧度>

参与者<Users>

触发器<Silde the middradianslider>





用例：<randomBtn>

编号：11

级别：<中等>

Description<随机选择参数>

参与者<Users>

触发器<按随机按钮>





用例：<startBtn>

编号：12

级别：<中等>

说明<开始绘制过程>

参与者<Users>

触发器<按下启动按钮>





用例：<stoptBtn>

编号：13

级别：<中等>

说明<暂停绘制过程>

参与者<Users>

触发器<按下停止按钮>





用例：<resumeBtn>

编号：14

级别：<中等>

Description<继续暂停的绘图过程>

参与者<Users>

触发器<按恢复按钮>





用例：<infoTextField>

编号：15

级别：<中等>

Description<运行应用程序时打印所有信息>

参与者<Users>

触发器<启动应用程序并按一些按钮>


/**
 *Plant Growth Simulation application
 * 
 * @author HangXia NUID 001534616
 *         Northeastern University
 *         CSYE6200: Object-Oriented Design
 *         Professor: Mark Mumson
 *
 * ----------------------Function Description-------------------------
 * A java swing application to simulate the process of plant growth.
 * 
 * Before press the start button, users can change some basic settings
 * which include growth rule, growth generation, plant color, whether 
 * to show growth process and the stems' length and radian. Also users
 * can press random button to set parameters randomly
 * 
 * After press the start button, the panel will show the picture of the 
 * plant, and it can show growth process when the growth process box is 
 * not "no process".
 * 
 * When the growth process box is "fast", "middle" or "slow", then users  
 * can press stop button to pause the draw process; when the draw process
 * is paused, users can press resume button to start again.
 * 
 * In the draw process, it is not able to resize the window. After the 
 * draw process is done, it is able to resize the window.
 * 
 * In the file menu, users can click “exit” to exit the application,
 * and in the help menu, users can click "about" to see the helping
 * file: Readme.md.
 * 
 * During the draw process, There are two variables that can be modified 
 * in real time: growth rate and color.
 * 
 * All the information will be printed in the JTextField in the InfoPanel -
 * at the right side of the main panel.
 * -------------------------------------------------------------------
 */

/*------------------------use cases-------------------------------*/

Use Case: <FileMenu: Exit>
Id:  1
Level: <Medium>
Description <Exit the application>
Actor(s) <Users>
Trigger <Click file menu and click exit>



Use Case: <HelpMenu: About>
Id:  2
Level: <Medium>
Description <Show helping file: Readme.md>
Actor(s) <Users>
Trigger <Click help menu and click about>



Use Case: <ruleBox>
Id:  3
Level: <Medium>
Description <Choose which rule (rule1/2/3) to simulate and draw.>
Actor(s) <Users>
Trigger <Select different rules in JComboBox>



Use Case: <genTextFiled >
Id:  4
Level: <Medium>
Description <Set the maximum generation to grow (0~9)>
Actor(s) <Users>
Trigger <Type 0 to 9 in the JTextField: genTextField>



Use Case: <colorBox>
Id:  5
Level: <Medium>
Description <Choose which color to draw.>
Actor(s) <Users>
Trigger <Select different colors in JComboBox>



Use Case: <growthBox>
Id:  6
Level: <Medium>
Description <Choose whether or not to show growth process>
Actor(s) <Users>
Trigger <Select different rules in JComboBox (true of false)>



Use Case: <lengthSlider>
Id:  7
Level: <Medium>
Description <Slide the slider to set different growth length>
Actor(s)  <Users>
Trigger <Silde the lengthSlider>



Use Case: <radianSlider>
Id:  8
Level: <Medium>
Description <Slide the slider to set different rotation radian>
Actor(s) <Users>
Trigger <Silde the radianSlider>



Use Case: <midLengthSlider>
Id:  9
Level: <Medium>
Description <Slide the slider to set different growth length of middle stems. Only available at rule2/3; in rule3 which has four growth direction, it effects the growth of two middle directions>
Actor(s) <Users>
Trigger <Silde the midLengthSlider>



Use Case: <midRadianSlider>
Id:  10
Level: <Medium>
Description <Slide the slider to set different rotation radian of middle stems. Only available at rule3; in rule3 which has four growth direction, it effects the radian of two middle directions>
Actor(s) <Users>
Trigger <Silde the midRadianSlider>



Use Case: <randomBtn>
Id:  11
Level: <Medium>
Description <select the parameters randomly>
Actor(s) <Users>
Trigger <Press the random button>



Use Case: <startBtn>
Id:  12
Level: <Medium>
Description <Start the draw process>
Actor(s) <Users>
Trigger <Press the start button>



Use Case: <stoptBtn>
Id:  13
Level: <Medium>
Description <Pause the draw process>
Actor(s) <Users>
Trigger <Press the stop button>



Use Case: <resumeBtn>
Id:  14
Level: <Medium>
Description <Resume the paused draw process>
Actor(s) <Users>
Trigger <Press the resume button>



Use Case: <infoTextField>
Id: 15
Level: <Medium>
Description <Print all the information when running the application>
Actor(s) <Users>
Trigger <Start the application and press some buttons>
