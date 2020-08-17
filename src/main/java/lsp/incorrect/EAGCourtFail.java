package lsp.incorrect;

public class EAGCourtFail extends CourtFail {

    @Override
    public void cutGrass() {
        throw new IllegalArgumentException("Pista dura no tiene cesped que cortar.");
    }
}
