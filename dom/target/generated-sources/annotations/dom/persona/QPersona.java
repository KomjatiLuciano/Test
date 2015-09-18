package dom.persona;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPersona extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Persona> implements PersistableExpression<Persona>
{
    public static final QPersona jdoCandidate = candidate("this");

    public static QPersona candidate(String name)
    {
        return new QPersona(null, name, 5);
    }

    public static QPersona candidate()
    {
        return jdoCandidate;
    }

    public static QPersona parameter(String name)
    {
        return new QPersona(Persona.class, name, ExpressionType.PARAMETER);
    }

    public static QPersona variable(String name)
    {
        return new QPersona(Persona.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression apellido;
    public final StringExpression nombre;
    public final ObjectExpression<dom.tipoDeSexo.TipoDeSexoEnum> tipoDeSexo;
    public final ObjectExpression<org.joda.time.LocalDate> fechaNacimiento;
    public final ObjectExpression<dom.tipoDocumento.TipoDocumentoEnum> tipoDocumento;
    public final StringExpression documento;
    public final dom.ciudadProvincia.QProvincia provincia;
    public final dom.ciudadProvincia.QCiudad ciudad;
    public final StringExpression direccion;
    public final StringExpression correo;
    public final StringExpression telefono;

    public QPersona(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.apellido = new StringExpressionImpl(this, "apellido");
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.tipoDeSexo = new ObjectExpressionImpl<dom.tipoDeSexo.TipoDeSexoEnum>(this, "tipoDeSexo");
        this.fechaNacimiento = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "fechaNacimiento");
        this.tipoDocumento = new ObjectExpressionImpl<dom.tipoDocumento.TipoDocumentoEnum>(this, "tipoDocumento");
        this.documento = new StringExpressionImpl(this, "documento");
        if (depth > 0)
        {
            this.provincia = new dom.ciudadProvincia.QProvincia(this, "provincia", depth-1);
        }
        else
        {
            this.provincia = null;
        }
        if (depth > 0)
        {
            this.ciudad = new dom.ciudadProvincia.QCiudad(this, "ciudad", depth-1);
        }
        else
        {
            this.ciudad = null;
        }
        this.direccion = new StringExpressionImpl(this, "direccion");
        this.correo = new StringExpressionImpl(this, "correo");
        this.telefono = new StringExpressionImpl(this, "telefono");
    }

    public QPersona(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.apellido = new StringExpressionImpl(this, "apellido");
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.tipoDeSexo = new ObjectExpressionImpl<dom.tipoDeSexo.TipoDeSexoEnum>(this, "tipoDeSexo");
        this.fechaNacimiento = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "fechaNacimiento");
        this.tipoDocumento = new ObjectExpressionImpl<dom.tipoDocumento.TipoDocumentoEnum>(this, "tipoDocumento");
        this.documento = new StringExpressionImpl(this, "documento");
        this.provincia = new dom.ciudadProvincia.QProvincia(this, "provincia", 5);
        this.ciudad = new dom.ciudadProvincia.QCiudad(this, "ciudad", 5);
        this.direccion = new StringExpressionImpl(this, "direccion");
        this.correo = new StringExpressionImpl(this, "correo");
        this.telefono = new StringExpressionImpl(this, "telefono");
    }
}
