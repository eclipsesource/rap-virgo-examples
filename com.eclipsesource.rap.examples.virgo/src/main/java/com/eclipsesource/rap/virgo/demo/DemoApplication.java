package com.eclipsesource.rap.virgo.demo;

import org.eclipse.rwt.lifecycle.IEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class DemoApplication implements IEntryPoint {

	@Override
	public int createUI() {
		Display display = new Display();
		Shell mainShell = new Shell(display, SWT.TITLE);
		mainShell.setText("RAP Virgo Demo");
		mainShell.setMaximized(true);
		mainShell.setLayout(new GridLayout());

		Label label = new Label(mainShell, SWT.NONE);
		label.setText("Hello Virgo world!");
		label.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));

		mainShell.layout();
		mainShell.open();
		return 0;
	}
}
