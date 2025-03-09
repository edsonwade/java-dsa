package code.vanilson.solid.srp.good;

/**
 * Esta classe ReportManager cumpre com o princípio da responsabilidade única (SRP)
 * pois é responsável por gerenciar a geração, salvamento e envio de relatórios.
 */
public class ReportManager {
    private final GenerateReport generateReport;
    private final SaveReport saveReport;
    private final CreateEmail createEmail;

    // Injeção de dependência através do construtor
    public ReportManager(GenerateReport generateReport, SaveReport saveReport, CreateEmail createEmail) {
        this.generateReport = generateReport;
        this.saveReport = saveReport;
        this.createEmail = createEmail;
    }

    public void generateAndSendReports() {
        generateReport.generateReports();
        saveReport.saveReports();
        createEmail.createEmail();
    }

    public static void main(String[] args) {
        // Instanciando as classes de operação
        GenerateReport generateReport = new GenerateReport();
        SaveReport saveReport = new SaveReport();
        CreateEmail createEmail = new CreateEmail();

        // Passando as dependências para o ReportManager
        ReportManager reportManager = new ReportManager(generateReport, saveReport, createEmail);
        reportManager.generateAndSendReports();
    }
}




