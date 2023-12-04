package transporte_Viario;

import java.time.LocalDateTime;
import java.util.Date;

public class class_Checkpoint {
    private static LocalDateTime fimTrajeto;
	private class_Jornada jornada;
    private Date dataCheckpoint;
	
    public class_Checkpoint(class_Jornada jornada, Date dataCheckpoint) {
		super();
		this.jornada = jornada;
		this.dataCheckpoint = dataCheckpoint;
	}

	public class_Jornada getJornada() {
		return jornada;
	}

	public void setJornada(class_Jornada jornada) {
		this.jornada = jornada;
	}

	public Date getDataCheckpoint() {
		return dataCheckpoint;
	}

	public void setDataCheckpoint(Date dataCheckpoint) {
		this.dataCheckpoint = dataCheckpoint;
	}

	public LocalDateTime getFimTrajeto() {
		return fimTrajeto;
	}

	public void setFimTrajeto(LocalDateTime fimTrajeto) {
		this.fimTrajeto = fimTrajeto;
	}

	public static void registrarCheckpoint() {
        if (fimTrajeto == null) {
            fimTrajeto = LocalDateTime.now();
            System.out.println("Checkpoint registrado - Fim de Trajeto: " + fimTrajeto);
        } else {
            System.out.println("O trajeto já foi finalizado. Não é possível registrar outro checkpoint.");
        }
    }
    
}
