package dom.paciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPaciente extends dom.persona.QPersona
{
    public static final QPaciente jdoCandidate = candidate("this");

    public static QPaciente candidate(String name)
    {
        return new QPaciente(null, name, 5);
    }

    public static QPaciente candidate()
    {
        return jdoCandidate;
    }

    public static QPaciente parameter(String name)
    {
        return new QPaciente(Paciente.class, name, ExpressionType.PARAMETER);
    }

    public static QPaciente variable(String name)
    {
        return new QPaciente(Paciente.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> legajo;
    public final ObjectExpression<dom.estado.EstadoEnum> estado;
    public final ObjectExpression<dom.grupoSanguineo.GrupoSanguineoEnum> grupoSanguineo;
    public final ListExpression listaTurnos;

    public QPaciente(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.legajo = new NumericExpressionImpl<Integer>(this, "legajo");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
        this.grupoSanguineo = new ObjectExpressionImpl<dom.grupoSanguineo.GrupoSanguineoEnum>(this, "grupoSanguineo");
        this.listaTurnos = new ListExpressionImpl(this, "listaTurnos");
    }

    public QPaciente(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.legajo = new NumericExpressionImpl<Integer>(this, "legajo");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
        this.grupoSanguineo = new ObjectExpressionImpl<dom.grupoSanguineo.GrupoSanguineoEnum>(this, "grupoSanguineo");
        this.listaTurnos = new ListExpressionImpl(this, "listaTurnos");
    }
}
