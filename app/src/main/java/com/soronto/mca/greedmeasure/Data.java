package com.soronto.mca.greedmeasure;

/**
 * Created by soronto on 5/4/2017.
 */
public class Data {
    public int getTotalPage() {
        return totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }
    public void setNextPage() {
        this.currentPage++;
        if(this.currentPage == this.totalPage)this.currentPage--;
    }
    public void setPrivPage(){
        this.currentPage--;
        if(this.currentPage==-1)this.currentPage++;
    }

    public int totalPage;
    public int currentPage;
    public String[][] content;

    public void initContent(){
        this.content=new String[16][5];
        this.content[0][0]="1. 하루 30분 이상 책을 읽는다";
        this.content[0][1]="20년";
        this.content[0][2]="10년";
        this.content[0][3]="5년";
        this.content[0][4]="없음";

        this.content[1][0]="2. 책 읽는 것을 좋아한다 ";
        this.content[1][1]="20년";
        this.content[1][2]="10년";
        this.content[1][3]="5년";
        this.content[1][4]="없음";

        this.content[2][0]="3. 매일 할 일을 메모한다 ";
        this.content[2][1]="20년";
        this.content[2][2]="10년";
        this.content[2][3]="5년";
        this.content[2][4]="없음";

        this.content[3][0]="4. TV를 하루에 1시간 미만 본다 ";
        this.content[3][1]="20년";
        this.content[3][2]="10년";
        this.content[3][3]="5년";
        this.content[3][4]="없음";

        this.content[4][0]="5. TV 볼때는 리얼리티 프로그램을 보지 않는다. ";
        this.content[4][1]="20년";
        this.content[4][2]="10년";
        this.content[4][3]="5년";
        this.content[4][4]="없음";

        this.content[5][0]="6. 등교 3시간 전에 일어난다 ";
        this.content[5][1]="20년";
        this.content[5][2]="10년";
        this.content[5][3]="5년";
        this.content[5][4]="없음";

        this.content[6][0]="7. 일주일에 4번 이상 운동한다 ";
        this.content[6][1]="20년";
        this.content[6][2]="10년";
        this.content[6][3]="5년";
        this.content[6][4]="없음";

        this.content[7][0]="8. 등하교 시간에 오디오북을 듣는다 ";
        this.content[7][1]="20년";
        this.content[7][2]="10년";
        this.content[7][3]="5년";
        this.content[7][4]="없음";

        this.content[8][0]="9. 목표를 글로 적어 둔다 ";
        this.content[8][1]="20년";
        this.content[8][2]="10년";
        this.content[8][3]="5년";
        this.content[8][4]="없음";

        this.content[9][0]="10. 구체적인 목표 달성에 집중한다 ";
        this.content[9][1]="20년";
        this.content[9][2]="10년";
        this.content[9][3]="5년";
        this.content[9][4]="없음";

        this.content[10][0]="11. 평생을 통해 교육을 받으며, 자기계발에 힘을 써야 한다고 믿는다 ";
        this.content[10][1]="20년";
        this.content[10][2]="10년";
        this.content[10][3]="5년";
        this.content[10][4]="없음";

        this.content[11][0]="12. 좋은 습관이 좋은 기회를 만든다고 믿는다 ";
        this.content[11][1]="20년";
        this.content[11][2]="10년";
        this.content[11][3]="5년";
        this.content[11][4]="없음";

        this.content[12][0]="13. 나쁜 습관이 인생에 부정적인 영향을 미친다고 믿는다 ";
        this.content[12][1]="20년";
        this.content[12][2]="10년";
        this.content[12][3]="5년";
        this.content[12][4]="없음";

        this.content[13][0]="14. 부모에게 성공하는 습관을 배운다 ";
        this.content[13][1]="20년";
        this.content[13][2]="10년";
        this.content[13][3]="5년";
        this.content[13][4]="없음";

        this.content[14][0]="15. 한 달에 10시간 이상 봉사활동을 한다 ";
        this.content[14][1]="20년";
        this.content[14][2]="10년";
        this.content[14][3]="5년";
        this.content[14][4]="없음";

        this.content[15][0]="16. 매달 2권 이상의 비문학 서적을 읽는다 ";
        this.content[15][1]="20년";
        this.content[15][2]="10년";
        this.content[15][3]="5년";
        this.content[15][4]="없음";
    }

    public Data() {
        this.initContent();
    }

    public String[] getCurrentStrings(){
        return this.content[this.currentPage];
    }

    public static void main(String[] args) {
    }
}
