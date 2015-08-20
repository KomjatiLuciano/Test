package dom.turno;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAgenda extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Agenda> implements PersistableExpression<Agenda>
{
    public static final QAgenda jdoCandidate = candidate("this");

    public static QAgenda candidate(String name)
    {
        return new QAgenda(null, name, 5);
    }

    public static QAgenda candidate()
    {
        return jdoCandidate;
    }

    public static QAgenda parameter(String name)
    {
        return new QAgenda(Agenda.class, name, ExpressionType.PARAMETER);
    }

    public static QAgenda variable(String name)
    {
        return new QAgenda(Agenda.class, name, ExpressionType.VARIABLE);
    }

    public final DateTimeExpression dia;
    public final dom.doctor.QDoctor doctor;
    public final ObjectExpression<java.lang.Boolean> disponible;
    public final ObjectExpression<dom.turno.IEstadoTurno> iEstadoTurno;
    public final dom.turno.QTurnoDisponible turnoDisponible;
    public final dom.turno.QTurnoSolicitado turnoSolicitado;
    public final dom.turno.QTurnoAceptado turnoAceptado;
    public final dom.turno.QTurnoAtendido turnoAtendido;
    public final dom.turno.QTurnoCancelado turnoCancelado;

    public QAgenda(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.dia = new DateTimeExpressionImpl(this, "dia");
        if (depth > 0)
        {
            this.doctor = new dom.doctor.QDoctor(this, "doctor", depth-1);
        }
        else
        {
            this.doctor = null;
        }
        this.disponible = new ObjectExpressionImpl<java.lang.Boolean>(this, "disponible");
        this.iEstadoTurno = new ObjectExpressionImpl<dom.turno.IEstadoTurno>(this, "iEstadoTurno");
        if (depth > 0)
        {
            this.turnoDisponible = new dom.turno.QTurnoDisponible(this, "turnoDisponible", depth-1);
        }
        else
        {
            this.turnoDisponible = null;
        }
        if (depth > 0)
        {
            this.turnoSolicitado = new dom.turno.QTurnoSolicitado(this, "turnoSolicitado", depth-1);
        }
        else
        {
            this.turnoSolicitado = null;
        }
        if (depth > 0)
        {
            this.turnoAceptado = new dom.turno.QTurnoAceptado(this, "turnoAceptado", depth-1);
        }
        else
        {
            this.turnoAceptado = null;
        }
        if (depth > 0)
        {
            this.turnoAtendido = new dom.turno.QTurnoAtendido(this, "turnoAtendido", depth-1);
        }
        else
        {
            this.turnoAtendido = null;
        }
        if (depth > 0)
        {
            this.turnoCancelado = new dom.turno.QTurnoCancelado(this, "turnoCancelado", depth-1);
        }
        else
        {
            this.turnoCancelado = null;
        }
    }

    public QAgenda(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.dia = new DateTimeExpressionImpl(this, "dia");
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.disponible = new ObjectExpressionImpl<java.lang.Boolean>(this, "disponible");
        this.iEstadoTurno = new ObjectExpressionImpl<dom.turno.IEstadoTurno>(this, "iEstadoTurno");
        this.turnoDisponible = new dom.turno.QTurnoDisponible(this, "turnoDisponible", 5);
        this.turnoSolicitado = new dom.turno.QTurnoSolicitado(this, "turnoSolicitado", 5);
        this.turnoAceptado = new dom.turno.QTurnoAceptado(this, "turnoAceptado", 5);
        this.turnoAtendido = new dom.turno.QTurnoAtendido(this, "turnoAtendido", 5);
        this.turnoCancelado = new dom.turno.QTurnoCancelado(this, "turnoCancelado", 5);
    }
}
