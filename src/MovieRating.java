public class MovieRating {
    String[] movies = {"All is Well","One Man Army","Why Love","I Hate You","Love is Blind"};
    double[] ratings = {3.7,5,3.4,4.2,5};


    public void highestRating(){
        double largest = ratings[0];
        int large =0;
        for(int i=0;i<ratings.length;i++){

            if(largest>=ratings[i]){
                largest=ratings[i];
                large=i;
            }
        }
        System.out.println(movies[large]);
    }
}
