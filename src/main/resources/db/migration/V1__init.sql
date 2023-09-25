CREATE TABLE IF NOT EXISTS public.order (
    order_id UUID PRIMARY KEY,
    created_at TIMESTAMPTZ,
    client_info TEXT,
    courier_info TEXT,
    delivery_address TEXT,
    delivery_time TIMESTAMPTZ,
    order_list TEXT
)