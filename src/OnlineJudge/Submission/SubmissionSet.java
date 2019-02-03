/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.Submission;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author MAHDI
 */
public class SubmissionSet {

    private static HashMap< Integer, Submission> Submissions = new HashMap< Integer, Submission>();
    static final File path = new File("SubmissionSet");
    static final String FileSeparator = System.getProperty("file.separator");
    public static Integer TotalSubmissions = new Integer(0);

    public static Integer getTotalSubmissions() {
        return TotalSubmissions;
    }

    public static void setTotalSubmissions(Integer TotalSubmissions) {
        SubmissionSet.TotalSubmissions = TotalSubmissions;
    }

    public static HashMap<Integer, Submission> getSubmissions() {
        synchronized (Submissions) {
            return Submissions;
        }
    }

    public static void setSubmissions(HashMap<Integer, Submission> Submissions) {
        synchronized (SubmissionSet.Submissions) {
            SubmissionSet.Submissions = Submissions;
        }
    }

}
