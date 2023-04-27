package week2day3;

public class LikeAccumulate {
    //178페이지 위
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount = likeCount + 1;
        System.out.println(likeCount); //좋아요를 한 개만 받은 경우

        likeCount =likeCount +1; //좋아요를 한 개 더 받은 경우
        System.out.println(likeCount);

        likeCount = likeCount - 1;
        System.out.println(likeCount); //좋아요를 취소한경우;
    }
}
