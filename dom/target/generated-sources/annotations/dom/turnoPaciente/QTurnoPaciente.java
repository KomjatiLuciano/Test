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
    public final dom.doctor.QDoctor doctor;
    public final ObjectExpression<dom.turnoPaciente.IEstadoTurno> estado;
    public final dom.turnoPaciente.QAceptado aceptado;
    public final dom.turnoPaciente.QAtendido atendido;
    public final dom.turnoPaciente.QCancelado cancelado;
    public final dom.turnoPaciente.QDisponible disponible;
    public final BooleanExpression disponerOcultado;
    public final BooleanExpression solicitarOcultado;
    public final BooleanExpression aceptarOcultado;
    public final BooleanExpression atenderOcultado;
    public final BooleanExpression cancelarOcultado;
    public final dom.turnoPaciente.QSolicitado solicitado;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;

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
        if (depth > 0)
        {
            this.doctor = new dom.doctor.QDoctor(this, "doctor", depth-1);
        }
        else
        {
            this.doctor = null;
        }
        this.estado = new ObjectExpressionImpl<dom.turnoPaciente.IEstadoTurno>(this, "estado");
        if (depth > 0)
        {
            this.aceptado = new dom.turnoPaciente.QAceptado(this, "aceptado", depth-1);
        }
        else
        {
            this.aceptado = null;
        }
        if (depth > 0)
        {
            this.atendido = new dom.turnoPaciente.QAtendido(this, "atendido", depth-1);
        }
        else
        {
            this.atendido = null;
        }
        if (depth > 0)
        {
            this.cancelado = new dom.turnoPaciente.QCancelado(this, "cancelado", depth-1);
        }
        else
        {
            this.cancelado = null;
        }
        if (depth > 0)
        {
            this.disponible = new dom.turnoPaciente.QDisponible(this, "disponible", depth-1);
        }
        else
        {
            this.disponible = null;
        }
        this.disponerOcultado = new BooleanExpressionImpl(this, "disponerOcultado");
        this.solicitarOcultado = new BooleanExpressionImpl(this, "solicitarOcultado");
        this.aceptarOcultado = new BooleanExpressionImpl(this, "aceptarOcultado");
        this.atenderOcultado = new BooleanExpressionImpl(this, "atenderOcultado");
        this.cancelarOcultado = new BooleanExpressionImpl(this, "cancelarOcultado");
        if (depth > 0)
        {
            this.solicitado = new dom.turnoPaciente.QSolicitado(this, "solicitado", depth-1);
        }
        else
        {
            this.solicitado = null;
        }
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }

    public QTurnoPaciente(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.paciente = new dom.paciente.QPaciente(this, "paciente", 5);
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.estado = new ObjectExpressionImpl<dom.turnoPaciente.IEstadoTurno>(this, "estado");
        this.aceptado = new dom.turnoPaciente.QAceptado(this, "aceptado", 5);
        this.atendido = new dom.turnoPaciente.QAtendido(this, "atendido", 5);
        this.cancelado = new dom.turnoPaciente.QCancelado(this, "cancelado", 5);
        this.disponible = new dom.turnoPaciente.QDisponible(this, "disponible", 5);
        this.disponerOcultado = new BooleanExpressionImpl(this, "disponerOcultado");
        this.solicitarOcultado = new BooleanExpressionImpl(this, "solicitarOcultado");
        this.aceptarOcultado = new BooleanExpressionImpl(this, "aceptarOcultado");
        this.atenderOcultado = new BooleanExpressionImpl(this, "atenderOcultado");
        this.cancelarOcultado = new BooleanExpressionImpl(this, "cancelarOcultado");
        this.solicitado = new dom.turnoPaciente.QSolicitado(this, "solicitado", 5);
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }
}
