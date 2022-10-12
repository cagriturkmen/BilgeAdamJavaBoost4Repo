package com.bilgeadam.boost.week08.lesson003.abstractfactorypattern;

public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}

}
