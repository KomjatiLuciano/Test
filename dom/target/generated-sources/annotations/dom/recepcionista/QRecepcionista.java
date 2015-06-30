package dom.recepcionista;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QRecepcionista extends dom.persona.QPersona
{
    public static final QRecepcionista jdoCandidate = candidate("this");

    public static QRecepcionista candidate(String name)
    {
        return new QRecepcionista(null, name, 5);
    }

    public static QRecepcionista candidate()
    {
        return jdoCandidate;
    }

    public static QRecepcionista parameter(String name)
    {
        return new QRecepcionista(Recepcionista.class, name, ExpressionType.PARAMETER);
    }

    public static QRecepcionista variable(String name)
    {
        return new QRecepcionista(Recepcionista.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> legajo;
    public final ObjectExpression<dom.estado.EstadoEnum> estado;

    public QRecepcionista(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.legajo = new NumericExpressionImpl<Integer>(this, "legajo");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
    }

    public QRecepcionista(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.legajo = new NumericExpressionImpl<Integer>(this, "legajo");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
    }
}
