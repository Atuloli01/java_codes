class Video{
    private int videoId,views,likes,totalVideos;
    private String title;

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVideoId() {
        return videoId;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getTotalVideos() {
        return totalVideos;
    }

    public String getTitle() {
        return title;
    }
}
public class _61Video{
    public static void main(String []args){
        Video obj=new Video();
        obj.setVideoId(01);
        obj.setTitle("How to get 500 Million Views in Youtube");
        obj.setViews(5000000);
        obj.setLikes(1000000);
        obj.setTotalVideos(11);
        System.out.println("Video id is : "+obj.getVideoId());
        System.out.println("Video title is : "+obj.getTitle());
        System.out.println("Views on Video is : "+obj.getTotalVideos());
        System.out.println("Likes on Video are : "+obj.getLikes());
        System.out.println("Total Videos are : "+obj.getTotalVideos());
    }
}