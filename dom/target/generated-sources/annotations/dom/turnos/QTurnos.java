package dom.turnos;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnos extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Turnos> implements PersistableExpression<Turnos>
{
    public static final QTurnos jdoCandidate = candidate("this");

    public static QTurnos candidate(String name)
    {
        return new QTurnos(null, name, 5);
    }

    public static QTurnos candidate()
    {
        return jdoCandidate;
    }

    public static QTurnos parameter(String name)
    {
        return new QTurnos(Turnos.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnos variable(String name)
    {
        return new QTurnos(Turnos.class, name, ExpressionType.VARIABLE);
    }

    public final dom.doctor.QDoctor doctores;
    public final StringExpression descripcionTurno;
    public final ObjectExpression<org.joda.time.DateTime> fechaTurno;
    public final TimeExpression horaTurno;
    public final dom.paciente.QPaciente pacientes;

    public QTurnos(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.doctores = new dom.doctor.QDoctor(this, "doctores", depth-1);
        }
        else
        {
            this.doctores = null;
        }
        this.descripcionTurno = new StringExpressionImpl(this, "descripcionTurno");
        this.fechaTurno = new ObjectExpressionImpl<org.joda.time.DateTime>(this, "fechaTurno");
        this.horaTurno = new TimeExpressionImpl(this, "horaTurno");
        if (depth > 0)
        {
            this.pacientes = new dom.paciente.QPaciente(this, "pacientes", depth-1);
        }
        else
        {
            this.pacientes = null;
        }
    }

    public QTurnos(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.doctores = new dom.doctor.QDoctor(this, "doctores", 5);
        this.descripcionTurno = new StringExpressionImpl(this, "descripcionTurno");
        this.fechaTurno = new ObjectExpressionImpl<org.joda.time.DateTime>(this, "fechaTurno");
        this.horaTurno = new TimeExpressionImpl(this, "horaTurno");
        this.pacientes = new dom.paciente.QPaciente(this, "pacientes", 5);
    }
}
