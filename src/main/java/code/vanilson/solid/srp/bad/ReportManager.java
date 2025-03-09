package code.vanilson.solid.srp.bad;

/**
 * Está classe ReportManager viola o princípio da responsabilidade unica (SRP)
 * Pois é responsavel por 3 funcionalidade:
 * - generateReports() → gerar reports
 * - saveReports() → salvar reports
 * - createEmail() → criar emails
 * <p>
 * Sendo que a class deve ter uma unica responsablidade, ou um unico motivo para mudar.
 */
public class ReportManager {

    public void generateReports() {
        System.out.println("Report generated!!");
    }

    public void saveReports() {
        System.out.println("Save report generated!!");
    }

    public void createEmail() {
        System.out.println("Create email generated!!");
    }

    public static void main(String[] args) {
        ReportManager reportManager = new ReportManager();
        reportManager.generateReports();
        reportManager.saveReports();
        reportManager.createEmail();
    }
}
