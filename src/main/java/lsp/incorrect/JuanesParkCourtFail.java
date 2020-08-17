package lsp.incorrect;

public class JuanesParkCourtFail extends CourtFail{

    @Override
    public void cutGrass() {
        throw new IllegalArgumentException("Tierra no tiene cesped que cortar.");
    }

}
