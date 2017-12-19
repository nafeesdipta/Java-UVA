package compare;

public class Song implements Comparable<Song>{
    String title;
    String Artist;
    int time;
    public Song(String title,String Artist,int time)
    {
    this.title=title;
    this.Artist=Artist;
    this.time=time;
    }
    public String gettitle()
    {
    return title;
    }
    public String getArtist()
    {
    return Artist;
    }
    public int gettime()
    {
    return time;
    }
    public String toString()
    {
    return title+":"+Artist+":"+time;
    }
//    public String toString(String Artist)
//    {
//    return Artist;
//    }
    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.gettitle());
    }
}
