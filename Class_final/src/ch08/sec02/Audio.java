package ch08.sec02;

public class Audio implements RemoteControl {
    private int volume; // 필드 선언
    
    
    public void turnOn() { // turnOn() 구현 완료
        System.out.println("Audio를 켭니다.");
    }
    
    
    public void turnOff() { // turnOff() 구현 완료
        System.out.println("Audio를 끕니다.");
    }
    
    
    public void setVolume(int volume) { 
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 불륨 : " + volume); 
    }


    private int memoryVolume;
    
    public void setMute(boolean mute) {
    	if(mute) {
    		this.memoryVolume = this.volume;
    		System.out.println("무음 처리 시작!!");
    		setVolume(MIN_VOLUME);
    	}
    	else
    	{
    		setVolume(this.memoryVolume);
    		System.out.println("무음 처리 해제!!");
    	}
    }

}