package nestedClasses;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}

	@Override
	public String toString() {
		return "Button [listener=" + listener + "]";
	}
	
	
}
