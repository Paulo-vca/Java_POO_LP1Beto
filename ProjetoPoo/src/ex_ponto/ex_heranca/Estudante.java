package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;

public class Estudante extends Pessoa {
    private String ra;
    private String curso;
    private LocalDate dtInicio; //quando iniciou o curso

    

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    @Override
    public String toString() {
        return "Ra: " + this.ra;
    }
}