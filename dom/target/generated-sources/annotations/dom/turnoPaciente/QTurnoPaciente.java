package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnoPaciente extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<TurnoPaciente> implements PersistableExpression<TurnoPaciente>
{
    public static final QTurnoPaciente jdoCandidate = candidate("this");

    public static QTurnoPaciente candidate(String name)
    {
        return new QTurnoPaciente(null, name, 5);
    }

    public static QTurnoPaciente candidate()
    {
        return jdoCandidate;
    }

    public static QTurnoPaciente parameter(String name)
    {
        return new QTurnoPaciente(TurnoPaciente.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnoPaciente variable(String name)
    {
        return new QTurnoPaciente(TurnoPaciente.class, name, ExpressionType.VARIABLE);
    }

    public final dom.paciente.QPaciente paciente;
    public final ObjectExpression<java.lang.Boolean> disponible;
    public final ObjectExpression<dom.turnoPaciente.IEstadoTurno> iEstadoTurno;
    public final dom.turnoPaciente.QTurnoDisponible turnoDisponible;
    public final dom.turnoPaciente.QTurnoSolicitado turnoSolicitado;
    public final dom.turnoPaciente.QTurnoAceptado turnoAceptado;
    public final dom.turnoPaciente.QTurnoAtendido turnoAtendido;
    public final dom.turnoPaciente.QTurnoCancelado turnoCancelado;

    public QTurnoPaciente(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.paciente = new dom.paciente.QPaciente(this, "paciente", depth-1);
        }
        else
        {
            this.paciente = null;
        }
        this.disponible = new ObjectExpressionImpl<java.lang.Boolean>(this, "disponible");
        this.iEstadoTurno = new ObjectExpressionImpl<dom.turnoPaciente.IEstadoTurno>(this, "iEstadoTurno");
        if (depth > 0)
        {
            this.turnoDisponible = new dom.turnoPaciente.QTurnoDisponible(this, "turnoDisponible", depth-1);
        }
        else
        {
            this.turnoDisponible = null;
        }
        if (depth > 0)
        {
            this.turnoSolicitado = new dom.turnoPaciente.QTurnoSolicitado(this, "turnoSolicitado", depth-1);
        }
        else
        {
            this.turnoSolicitado = null;
        }
        if (depth > 0)
        {
            this.turnoAceptado = new dom.turnoPaciente.QTurnoAceptado(this, "turnoAceptado", depth-1);
        }
        else
        {
            this.turnoAceptado = null;
        }
        if (depth > 0)
        {
            this.turnoAtendido = new dom.turnoPaciente.QTurnoAtendido(this, "turnoAtendido", depth-1);
        }
        else
        {
            this.turnoAtendido = null;
        }
        if (depth > 0)
        {
            this.turnoCancelado = new dom.turnoPaciente.QTurnoCancelado(this, "turnoCancelado", depth-1);
        }
        else
        {
            this.turnoCancelado = null;
        }
    }

    public QTurnoPaciente(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.paciente = new dom.paciente.QPaciente(this, "paciente", 5);
        this.disponible = new ObjectExpressionImpl<java.lang.Boolean>(this, "disponible");
        this.iEstadoTurno = new ObjectExpressionImpl<dom.turnoPaciente.IEstadoTurno>(this, "iEstadoTurno");
        this.turnoDisponible = new dom.turnoPaciente.QTurnoDisponible(this, "turnoDisponible", 5);
        this.turnoSolicitado = new dom.turnoPaciente.QTurnoSolicitado(this, "turnoSolicitado", 5);
        this.turnoAceptado = new dom.turnoPaciente.QTurnoAceptado(this, "turnoAceptado", 5);
        this.turnoAtendido = new dom.turnoPaciente.QTurnoAtendido(this, "turnoAtendido", 5);
        this.turnoCancelado = new dom.turnoPaciente.QTurnoCancelado(this, "turnoCancelado", 5);
    }
}
