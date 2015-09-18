package dom.horarioAtencion;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QHorarioAtencion extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<HorarioAtencion> implements PersistableExpression<HorarioAtencion>
{
    public static final QHorarioAtencion jdoCandidate = candidate("this");

    public static QHorarioAtencion candidate(String name)
    {
        return new QHorarioAtencion(null, name, 5);
    }

    public static QHorarioAtencion candidate()
    {
        return jdoCandidate;
    }

    public static QHorarioAtencion parameter(String name)
    {
        return new QHorarioAtencion(HorarioAtencion.class, name, ExpressionType.PARAMETER);
    }

    public static QHorarioAtencion variable(String name)
    {
        return new QHorarioAtencion(HorarioAtencion.class, name, ExpressionType.VARIABLE);
    }

    public final dom.doctor.QDoctor doctor;
    public final StringExpression rangoDesde;
    public final StringExpression rangoHasta;
    public final ObjectExpression<dom.horarioAtencion.DiaSemanaEnum> diaDeLaSemana;

    public QHorarioAtencion(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.doctor = new dom.doctor.QDoctor(this, "doctor", depth-1);
        }
        else
        {
            this.doctor = null;
        }
        this.rangoDesde = new StringExpressionImpl(this, "rangoDesde");
        this.rangoHasta = new StringExpressionImpl(this, "rangoHasta");
        this.diaDeLaSemana = new ObjectExpressionImpl<dom.horarioAtencion.DiaSemanaEnum>(this, "diaDeLaSemana");
    }

    public QHorarioAtencion(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.rangoDesde = new StringExpressionImpl(this, "rangoDesde");
        this.rangoHasta = new StringExpressionImpl(this, "rangoHasta");
        this.diaDeLaSemana = new ObjectExpressionImpl<dom.horarioAtencion.DiaSemanaEnum>(this, "diaDeLaSemana");
    }
}
