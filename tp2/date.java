package tp2;

public class date {
    int day ;
    int month ;
    int year ;
    public date(int day, int month, int year) {
        this.day = day ;
        this.month = month ;
        this.year = year ;
    }
    public int daysbt(date other) {
        int days1 = this.day + this.month * 30 + this.year * 365 ;
        int days2 = other.day + other.month * 30 + other.year * 365 ;
        return Math.abs(days1 - days2) ;
    }
    
}
