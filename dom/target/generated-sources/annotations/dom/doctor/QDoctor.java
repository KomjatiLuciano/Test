package dom.doctor;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDoctor extends dom.persona.QPersona
{
    public static final QDoctor jdoCandidate = candidate("this");

    public static QDoctor candidate(String name)
    {
        return new QDoctor(null, name, 5);
    }

    public static QDoctor candidate()
    {
        return jdoCandidate;
    }

    public static QDoctor parameter(String name)
    {
        return new QDoctor(Doctor.class, name, ExpressionType.PARAMETER);
    }

    public static QDoctor variable(String name)
    {
        return new QDoctor(Doctor.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression matricula;
    public final ObjectExpression<dom.especialidad.EspecialidadEnum> especialidad;
    public final ObjectExpression<dom.estado.EstadoEnum> estado;
    public final ListExpression listaDeTurnos;
    public final ObjectExpression<dom.dias.DiasEnum> dia;

    public QDoctor(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.matricula = new StringExpressionImpl(this, "matricula");
        this.especialidad = new ObjectExpressionImpl<dom.especialidad.EspecialidadEnum>(this, "especialidad");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
        this.listaDeTurnos = new ListExpressionImpl(this, "listaDeTurnos");
        this.dia = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "dia");
    }

    public QDoctor(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.matricula = new StringExpressionImpl(this, "matricula");
        this.especialidad = new ObjectExpressionImpl<dom.especialidad.EspecialidadEnum>(this, "especialidad");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
        this.listaDeTurnos = new ListExpressionImpl(this, "listaDeTurnos");
        this.dia = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "dia");
    }
}
