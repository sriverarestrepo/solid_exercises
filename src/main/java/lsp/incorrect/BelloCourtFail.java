package lsp.incorrect;

public class BelloCourtFail extends CourtFail{

    @Override
    public void cutGrass() {
        super.cutGrass();
        //Logica para cortar el cesped en Bello.
        System.out.println("Cortanto el cesped de Bello.");
    }
}
