package school.management.system;

/**This class is responsible for keeping the track of students fees, name, grade, id*/

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**To create a new student by initializing
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade if the student.
     */
  /*constructor*/
    public Student(int id, String name, int grade, int feesPaid) {
        this.feesPaid=feesPaid;
        this.feesTotal=feesTotal;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter students´t name, student´s id.


    /**Used to update the student´s grade.
     * @param grade new grade of student.
     */
    public  void setGrade(int grade) {
        this.grade=grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the feeds paid.
     * the school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the id of the student.
     */
    public int getId () {
        return id;
    }
    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "\nNombre alumno:"+name+ " id:"+id +" Nivel:"+grade + " Pago:" +feesPaid;
    }
}
