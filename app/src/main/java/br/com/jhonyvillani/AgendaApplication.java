package br.com.jhonyvillani;

import android.app.Application;

import br.com.jhonyvillani.dao.AlunoDAO;
import br.com.jhonyvillani.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Jhony", "1122223333", "jhony@gmail.com"));
        dao.salva(new Aluno("Pedro", "1122223333", "pedro@gmail.com"));
    }
}
