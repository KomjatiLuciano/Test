package dom.dueño;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDueño extends dom.persona.QPersona
{
    public static final QDueño jdoCandidate = candidate("this");

    public static QDueño candidate(String name)
    {
        return new QDueño(null, name, 5);
    }

    public static QDueño candidate()
    {
        return jdoCandidate;
    }

    public static QDueño parameter(String name)
    {
        return new QDueño(Dueño.class, name, ExpressionType.PARAMETER);
    }

    public static QDueño variable(String name)
    {
        return new QDueño(Dueño.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression iniciales;
    public final ObjectExpression<dom.estado.EstadoEnum> estado;

    public QDueño(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.iniciales = new StringExpressionImpl(this, "iniciales");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
    }

    public QDueño(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.iniciales = new StringExpressionImpl(this, "iniciales");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
    }
}
