interface AudioPlayer{
	public void playAudio();
}

interface VideoPlayer{
	public void playVideo();
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
	
	private String audio;
	private String video;
	
	MediaPlayer(String audio, String video){
		this.audio = audio;
		this.video = video;
	}
	
	public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
	
	public void playAudio(){
		System.out.println("\nPlaying Audio: "+getAudio());
	}
	
	public void playVideo(){
		System.out.println("\nPlaying Video: "+getVideo());
	}
	
}

class Que25{
	public static void main(String args[]){
		
		MediaPlayer m = new MediaPlayer("Shape of You", "Inception");
		m.playAudio();
		m.playVideo();
	}
}