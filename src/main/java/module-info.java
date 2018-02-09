module JMarkPad{
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;

	requires com.jfoenix;
	exports ui;
	exports ui.panes;
	opens ui.panes to javafx.fxml;
}