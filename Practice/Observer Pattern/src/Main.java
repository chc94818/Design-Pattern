
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IObserverable podcast = new PodcastA();
        IObserver student = new Student(podcast);
        podcast.add(student);

        //預設節目是英文廣播
        podcast.notifyObservers();

        //節目變為今年流行歌
        ((PodcastA) podcast).name = "今年流行歌";

        podcast.notifyObservers();
	}

}
