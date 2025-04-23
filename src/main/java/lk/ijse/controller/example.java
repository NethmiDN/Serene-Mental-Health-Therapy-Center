package lk.ijse.controller;

public class example {
//    @Entity
//    public class Therapy {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//        private String status; // "completed" or "upcoming"
//
//        private LocalDate date; // to filter today's date if needed
//    }
//
//    @Entity
//    public class Payment {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//        private String status; // "completed" or "pending"
//    }
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.chart.BarChart;
//import javafx.scene.chart.PieChart;
//import javafx.scene.chart.XYChart;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import java.net.URL;
//import java.time.LocalDate;
//import java.util.ResourceBundle;
//
//    public class DashboardController implements Initializable {
//
//        @FXML
//        private PieChart therapyPieChart;
//
//        @FXML
//        private BarChart<String, Number> paymentBarChart;
//
//        private SessionFactory factory;
//
//        @Override
//        public void initialize(URL location, ResourceBundle resources) {
//            // Setup Hibernate session factory
//            factory = new Configuration().configure().buildSessionFactory();
//
//            loadTherapyChartData();
//            loadPaymentChartData();
//        }
//
//        private void loadTherapyChartData() {
//            Session session = factory.openSession();
//            session.beginTransaction();
//
//            Long completed = (Long) session.createQuery("SELECT COUNT(*) FROM Therapy WHERE status = 'completed' AND date = :today")
//                    .setParameter("today", LocalDate.now())
//                    .uniqueResult();
//
//            Long upcoming = (Long) session.createQuery("SELECT COUNT(*) FROM Therapy WHERE status = 'upcoming' AND date = :today")
//                    .setParameter("today", LocalDate.now())
//                    .uniqueResult();
//
//            session.getTransaction().commit();
//            session.close();
//
//            long total = completed + upcoming;
//            double completedPercent = total > 0 ? (completed * 100.0 / total) : 0;
//            double upcomingPercent = total > 0 ? (upcoming * 100.0 / total) : 0;
//
//            ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
//                    new PieChart.Data("Completed (" + String.format("%.1f", completedPercent) + "%)", completed),
//                    new PieChart.Data("Upcoming (" + String.format("%.1f", upcomingPercent) + "%)", upcoming)
//            );
//
//            therapyPieChart.setData(pieData);
//            therapyPieChart.setTitle("Therapy Progress Today");
//        }
//
//        private void loadPaymentChartData() {
//            Session session = factory.openSession();
//            session.beginTransaction();
//
//            Long completed = (Long) session.createQuery("SELECT COUNT(*) FROM Payment WHERE status = 'completed'")
//                    .uniqueResult();
//
//            Long pending = (Long) session.createQuery("SELECT COUNT(*) FROM Payment WHERE status = 'pending'")
//                    .uniqueResult();
//
//            session.getTransaction().commit();
//            session.close();
//
//            XYChart.Series<String, Number> series = new XYChart.Series<>();
//            series.setName("Payments");
//
//            series.getData().add(new XYChart.Data<>("Completed", completed));
//            series.getData().add(new XYChart.Data<>("Pending", pending));
//
//            paymentBarChart.getData().clear();
//            paymentBarChart.getData().add(series);
//        }
//    }

}
