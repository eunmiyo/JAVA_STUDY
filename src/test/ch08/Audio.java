package test.ch08;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + volume);
	}

	private int memoryVolume;
	
	//RemoteControl객체안 default 메소드는 오버라이드시 반드시 public접근 제한자를 붙여야 한다.
	@Override
	public void setMute(boolean mute) {
		if(mute) { //true
			this.memoryVolume = this.volume; //현재 볼륨크기를 memoryVolume에 넣어둔다.
			System.out.println("음소거 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else { //false
			System.out.println("음소거 해제.");
			setVolume(this.memoryVolume); //저장되어있던 memoryVolume을 가져온다.
		}
	}
	
	
	
}
