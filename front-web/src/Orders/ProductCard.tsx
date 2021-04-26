import {ReactComponent as Pizza} from './pizza.svg'
import { Product } from './types';

type Props = {
    product: Product;
}

function ProductCard({product}:Props) {
    return (
        <div className="orders-card-container">    
            <h3 className="order-card-title">
                {product.name}
            </h3>       
            <Pizza className="order-card-image"/>
            <h3 className="order-card-price">
                R$ {product.price}
            </h3>
            <div className="order-card-description">
                <h3>Descrição</h3>
                <p>
                    {product.description}
                </p>
            </div>
        </div>
    )
}

export default ProductCard;
