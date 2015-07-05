package dom.dias;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDiasDoctores extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<DiasDoctores> implements PersistableExpression<DiasDoctores>
{
    public static final QDiasDoctores jdoCandidate = candidate("this");

    public static QDiasDoctores candidate(String name)
    {
        return new QDiasDoctores(null, name, 5);
    }

    public static QDiasDoctores candidate()
    {
        return jdoCandidate;
    }

    public static QDiasDoctores parameter(String name)
    {
        return new QDiasDoctores(DiasDoctores.class, name, ExpressionType.PARAMETER);
    }

    public static QDiasDoctores variable(String name)
    {
        return new QDiasDoctores(DiasDoctores.class, name, ExpressionType.VARIABLE);
    }

    public final dom.doctor.QDoctor doctor;
    public final ObjectExpression<dom.dias.DiasEnum> lunes;
    public final ObjectExpression<dom.dias.DiasEnum> martes;
    public final ObjectExpression<dom.dias.DiasEnum> miercoles;
    public final ObjectExpression<dom.dias.DiasEnum> jueves;
    public final ObjectExpression<dom.dias.DiasEnum> viernes;
    public final ObjectExpression<dom.dias.DiasEnum> sabado;
    public final ObjectExpression<dom.dias.DiasEnum> domingo;

    public QDiasDoctores(PersistableExpression parent, String name, int depth)
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
        this.lunes = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "lunes");
        this.martes = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "martes");
        this.miercoles = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "miercoles");
        this.jueves = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "jueves");
        this.viernes = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "viernes");
        this.sabado = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "sabado");
        this.domingo = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "domingo");
    }

    public QDiasDoctores(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.lunes = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "lunes");
        this.martes = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "martes");
        this.miercoles = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "miercoles");
        this.jueves = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "jueves");
        this.viernes = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "viernes");
        this.sabado = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "sabado");
        this.domingo = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "domingo");
    }
}
