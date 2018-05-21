package com.chain.tcp.gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.chain.tcp.constants.ToolGlobalConstants;
import com.chain.tcp.constants.ToolGuiConstants;
import com.chain.tcp.register.ToolGuiRegister;

public class ToolGui {

	public ToolGui() {
		initGui();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	private void initGui() {
		JFrame frame = new JFrame();
		frame.setTitle(ToolGlobalConstants.GLOBAL_PROJECT_NAME);
		frame.setSize(ToolGuiConstants.GUI_WINDOW_WIDTH, ToolGuiConstants.GUI_WINDOW_HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JFRAME, frame);

		JButton button_3 = new JButton("清除尚未发送内容");
		button_3.setBounds(323, 281, 167, 27);
		frame.getContentPane().add(button_3);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JBUTTON_CLEAR_UNSENDED, button_3);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(401, 89, 37, 24);
		frame.getContentPane().add(comboBox_1);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JCOMBOBOX_CONTENT_FORMAT, comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(90, 89, 37, 24);
		frame.getContentPane().add(comboBox_2);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JCOMBOBOX_SESSION_LIST, comboBox_2);

		JLabel lblIp = new JLabel("IP地址：");
		lblIp.setBounds(14, 53, 72, 18);
		frame.getContentPane().add(lblIp);

		JTextField textField = new JTextField();
		textField.setBounds(79, 50, 195, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JTEXTFIELD_IP_ADDRESS, textField);

		JLabel label = new JLabel("端口：");
		label.setBounds(288, 53, 72, 18);
		frame.getContentPane().add(label);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(335, 50, 113, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JTEXTFIELD_PORT_NUMBER, textField_1);

		JLabel label_1 = new JLabel("字符集：");
		label_1.setBounds(532, 92, 72, 18);
		frame.getContentPane().add(label_1);

		JButton button = new JButton("连接");
		button.setBounds(667, 49, 113, 27);
		frame.getContentPane().add(button);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JBUTTON_CONNECT_OR_LISTEN, button);

		JLabel label_2 = new JLabel("发送内容：");
		label_2.setBounds(14, 134, 118, 18);
		frame.getContentPane().add(label_2);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(14, 165, 766, 108);
		frame.getContentPane().add(textArea);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JTEXTAREA_SEND_CONTENT, textArea);

		JButton button_1 = new JButton("发送");
		button_1.setBounds(667, 281, 113, 27);
		frame.getContentPane().add(button_1);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JBUTTON_SEND, button_1);

		JCheckBox checkBox = new JCheckBox("连接断开或未连接时忽略尚未发送的内容");
		checkBox.setBounds(14, 282, 299, 27);
		frame.getContentPane().add(checkBox);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JCHECKBOX_IGNORE_WHEN_UNCONNECTED, checkBox);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(14, 536, 766, 108);
		frame.getContentPane().add(textArea_1);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JTEXTAREA_LOG_OUT_CONTENT, textArea_1);

		JCheckBox checkBox_1 = new JCheckBox("日志输出");
		checkBox_1.setBounds(14, 496, 133, 27);
		frame.getContentPane().add(checkBox_1);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JCHECKBOX_ENABLE_LOG_OUT, checkBox_1);

		JButton button_2 = new JButton("清除日志");
		button_2.setBounds(667, 496, 113, 27);
		frame.getContentPane().add(button_2);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JBUTTON_CLEAR_LOG_OUT, button_2);

		JLabel lblNewLabel = new JLabel("内容格式：");
		lblNewLabel.setBounds(323, 92, 94, 18);
		frame.getContentPane().add(lblNewLabel);

		JLabel label_11 = new JLabel("会话列表：");
		label_11.setBounds(14, 92, 94, 18);
		frame.getContentPane().add(label_11);

		JLabel label_12 = new JLabel("网络调试助手");
		label_12.setFont(new Font("SimSun", Font.BOLD, 20));
		label_12.setBounds(14, 13, 167, 18);
		frame.getContentPane().add(label_12);

		JRadioButton radioButton = new JRadioButton("发送");
		radioButton.setBounds(283, 13, 77, 27);
		frame.getContentPane().add(radioButton);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JRADIOBUTTON_SEND_MODE, radioButton);

		JRadioButton radioButton_1 = new JRadioButton("接收");
		radioButton_1.setBounds(216, 13, 59, 27);
		frame.getContentPane().add(radioButton_1);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JRADIOBUTTON_RECV_MODE, radioButton_1);

		JLabel label_13 = new JLabel("模式：");
		label_13.setBounds(173, 15, 72, 18);
		frame.getContentPane().add(label_13);

		JRadioButton radioButton_2 = new JRadioButton("短连接");
		radioButton_2.setBounds(473, 49, 77, 27);
		frame.getContentPane().add(radioButton_2);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JRADIOBUTTON_SHOT_CONNECT_MODE, radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("长连接");
		radioButton_3.setBounds(561, 49, 77, 27);
		frame.getContentPane().add(radioButton_3);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JRADIOBUTTON_LONG_CONNECT_MODE, radioButton_3);

		JLabel lblByQbq = new JLabel("By QBQ");
		lblByQbq.setBounds(732, 15, 48, 18);
		frame.getContentPane().add(lblByQbq);

		JLabel label_3 = new JLabel("简要信息：");
		label_3.setBounds(14, 470, 94, 17);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("无");
		label_4.setBounds(89, 469, 72, 18);
		frame.getContentPane().add(label_4);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JLABEL_BRIEF_INFO, label_4);

		JTextField textField_2 = new JTextField();
		textField_2.setBounds(599, 89, 181, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JTEXTFIELD_CHARSET_CONTENT, textField_2);

		JLabel label_5 = new JLabel("类型：");
		label_5.setBounds(379, 15, 48, 18);
		frame.getContentPane().add(label_5);

		JRadioButton radioButton_4 = new JRadioButton("TCP");
		radioButton_4.setBounds(422, 13, 59, 27);
		frame.getContentPane().add(radioButton_4);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JRADIOBUTTON_TCP_MODE, radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("UDP");
		radioButton_5.setBounds(487, 13, 77, 27);
		frame.getContentPane().add(radioButton_5);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JRADIOBUTTON_UDP_MODE, radioButton_5);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(14, 349, 766, 108);
		frame.getContentPane().add(textArea_2);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JTEXTAREA_RECV_CONTENT, textArea_2);

		JLabel label_6 = new JLabel("接收内容：");
		label_6.setBounds(14, 318, 118, 18);
		frame.getContentPane().add(label_6);

		JButton button_4 = new JButton("更新");
		button_4.setBounds(652, 11, 66, 27);
		frame.getContentPane().add(button_4);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JBUTTON_UPGRADE, button_4);

		JButton button_5 = new JButton("语言");
		button_5.setBounds(566, 11, 72, 27);
		frame.getContentPane().add(button_5);
		ToolGuiRegister.set(ToolGuiConstants.GUI_REGISTER_JBUTTON_LANGUAGE, button_5);
	}
}
