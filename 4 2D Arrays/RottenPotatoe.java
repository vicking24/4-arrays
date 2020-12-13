class RottenPotatoe {
    public static void main(String[]args){
        int[][] point = { {4,6,2,5}, {7,9,4,8},{6,9,3,7} };
        System.out.println ("Average Movie Ratings: "+movieAvgRating(point,3));
        System.out.println ("Average Reviewer Ratings: "+reviewerAvgRating(point,2));
        System.out.println ("Average Ratings 2018: "+avgRating2018(point));
        System.out.println ("Hardest Rater: "+hardestRater2018(point));
        System.out.println ("Worst Movie: "+worstMovie2018(point));
    }

    public static int movieAvgRating(int[][] ratings, int movie){
        int sum=0;
        int count=0;
        for (int r=0; r<ratings.length; r++){
            sum=sum+ratings[r][movie];
            count++;
        }
        return sum/count;
    }

    public static int reviewerAvgRating(int[][] ratings, int reviewer){
        int sum=0;
        int count=0;
        for (int c=0; c<ratings[reviewer].length; c++){
            sum=sum+ratings[reviewer][c];
            count++;
        }
        return sum/count;

    }

    public static int avgRating2018(int[][] ratings){
        int sum=0;
        int count=0;

        for (int r=0; r<ratings.length; r++){
            for (int c=0; c<ratings[r].length; c++){
                sum=sum+ratings[r][c];
                count++;
            }
        }
        return sum/count;

    }

    public static int hardestRater2018(int[][] ratings){
        int max=1000000;
        int sum=0;
        int count=0;
        int maxrev=0;

        for (int r=0; r<ratings.length; r++){
            for (int c=0; c<ratings[r].length; c++){
                sum=sum+ratings[r][c];
                count++;
            }
            if (sum/count<max){
                max=sum/count;
                maxrev=r;
            }
            sum=0;
            count=0;
           
        }
        return maxrev;

    }

    public static int worstMovie2018(int[][] ratings){
        int max=10000000;
        int sum=0;
        int count=0;
        int maxrev=0;

        for (int c=0; c<ratings[0].length; c++){
            for (int r=0; r<ratings.length; r++){
                sum=sum+ratings[r][c];
                count++;
               
            }
            
            if (sum/count<max){
                max=sum/count;
                maxrev=c;
            }
            sum=0;
            count=0;
        }
        return maxrev;

    }

}