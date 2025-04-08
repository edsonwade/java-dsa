package code.vanilson.builder;

/**
 * BookGenre
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public enum BookGenre {
    FICTION("Ficção", "Narrativas inventadas que não são baseadas em fatos reais."),
    NON_FICTION("Não-ficção", "Obras baseadas em fatos reais e informações verificáveis."),
    FANTASY("Fantasia", "Histórias que envolvem elementos mágicos e mundos imaginários."),
    MYSTERY("Mistério", "Histórias que envolvem enigmas e investigações."),
    SCIENCE_FICTION("Ficção Científica", "Obras que exploram conceitos científicos e tecnológicos."),
    BIOGRAPHY("Biografia", "Histórias da vida de pessoas reais."),
    POETRY("Poesia", "Obras escritas em forma poética.");

    private final String displayName;
    private final String description;

    BookGenre(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
}