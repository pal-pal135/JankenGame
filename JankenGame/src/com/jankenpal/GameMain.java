package com.jankenpal;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		//ウィンドウの表示
		JFrame frame = new JFrame("じゃんけんゲーム");
		//サイズ
		frame.setSize(640,480);
		//位置
		frame.setLocationRelativeTo(null);
		//×を押して終了
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//サイズの固定
		frame.setResizable(false);

		Panel.createPanel(frame);

		//ウィンドウの表示
		frame.setVisible(true);
	}
}
